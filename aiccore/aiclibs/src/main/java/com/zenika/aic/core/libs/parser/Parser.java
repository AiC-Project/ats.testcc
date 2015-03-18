package com.zenika.aic.core.libs.parser;

import com.android.ddmlib.testrunner.ITestRunListener;
import com.android.ddmlib.testrunner.InstrumentationResultParser;
import com.android.ddmlib.testrunner.TestIdentifier;
import com.google.gson.Gson;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map;

public class Parser {
	protected JunitTestSuite testSuites = new JunitTestSuite();
	private TestSuite currentTestSuite;
	private TestCase currentTestCase;

	/**
	 * Constructor.
	 * Create a paser that will a single fill or all files into a folder if the given argument is a folder
	 * @param folder Folder or file to parse.
	 */
	public Parser(File folder) {
		try {
			readFiles(folder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFiles(final File folder) throws IOException {
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				readFiles(fileEntry);
			} else {
				this.parse(fileEntry.getName(),readFile(fileEntry));
			}
		}
	}

	public String readFile(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();

		while (line != null) {
			sb.append(line);
			sb.append(System.lineSeparator());
			line = br.readLine();
		}
		br.close();
		return sb.toString();
	}

	public Parser(ArrayList<String> names, ArrayList<String> contents) {
		if(names.size() != contents.size())
			throw new IllegalArgumentException("Both names and contents must have the same size");

		for(int i=0; i<contents.size(); i++) {
			this.parse(names.get(i), contents.get(i));
		}
	}
	
	public Parser(final String testName, String content) {
		this.parse(testName,content);
	}
	
	public void parse(final String testName, String content) {

		ITestRunListener listener = new ITestRunListener() {

			@Override
			public void testStarted(TestIdentifier arg0) {
				currentTestCase = new TestCase(arg0.getClassName(), arg0.getTestName());
				//System.out.println("Test started : " + arg0.getTestName());				
			}

			@Override
			public void testRunStopped(long arg0) {
				//System.out.println("Test run stopped : " + arg0);				
			}

			@Override
			public void testRunStarted(String arg0, int arg1) {
				currentTestSuite = new TestSuite();
				//System.out.println("Test run started : " + arg0.toString());				
			}

			@Override
			public void testRunFailed(String arg0) {
				//System.out.println("Test run failed : " + arg0);				
			}

			@Override
			public void testRunEnded(long arg0, Map<String, String> arg1) {
				//System.out.println("Test run ended : " + arg0 + " " + arg1.toString());			
				currentTestSuite.setTime((double)arg0/1000+"");
				currentTestSuite.setName(testName);
				testSuites.addTestSuite(currentTestSuite);
			}

			@Override
			public void testFailed(TestFailure arg0, TestIdentifier arg1, String arg2) {
				currentTestCase = new TestCase(arg1.getClassName(), arg1.getTestName());

				BufferedReader reader = new BufferedReader(new StringReader(arg2));

				String error = null;
				try {
					error = reader.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				String[] errorSeperated = error.split(":", 2);

				switch(arg0.name()) {
				case "FAILURE":
					Failure f = new Failure();
					f.setType(errorSeperated[0]);
					f.setMessage(errorSeperated[1].trim());
					f.setContent(arg2);
					currentTestCase.setFailure(f);
					break;
				case "ERROR":
					currentTestCase.setError(arg2);
					break;
				}
			}

			@Override
			public void testEnded(TestIdentifier arg0, Map<String, String> arg1) {
				currentTestCase.setTime(arg1.get("time"));
				currentTestSuite.addTestCase(currentTestCase);
				//System.out.println("Test ended : " + arg0.toString() + " " + arg1.toString());				
			}
		};

		InstrumentationResultParser parser = new InstrumentationResultParser(testName, listener);

		String[] lines = content.split("\n");;
		parser.processNewLines(lines);
		parser.done();
	}

	public String toXml() throws Exception {
		Serializer serializer = new Persister();
		StringWriter stringWriter = new StringWriter();
		stringWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		serializer.write(testSuites, stringWriter);
		return stringWriter.toString();
	}

	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(testSuites);
	}
}
