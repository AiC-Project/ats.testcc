package com.zenika.aic.core.libs.parser;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
	@ElementList
	protected ArrayList<Property> properties = new ArrayList<>();
	
	@ElementList(inline=true,entry="testcase")
	protected ArrayList<TestCase> testCases = new ArrayList<>();
	
	@Attribute
	private String time;
	
	@Attribute
	private String name;
	
	public TestSuite() {
		
	}
	
	public void addTestCase(TestCase testCase) {
		testCases.add(testCase);
	}
	
	public void addProperty(Property property) {
		properties.add(property);
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<TestCase> getTestCases() {
		return testCases;
	}

	public void setTestCases(ArrayList<TestCase> testCases) {
		this.testCases = testCases;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<Property> properties) {
		this.properties = properties;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
