package com.zenika.aic.core.libs.parser;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root(name="testsuites")
public final class JunitTestSuite {
	
	@ElementList(inline=true,entry="testsuite")
	protected List<TestSuite> testSuites = new ArrayList<>();
	
	public final void addTestSuite(TestSuite testSuite) {
		testSuites.add(testSuite);
	}

	public final List<TestSuite> getTestSuites() {
		return testSuites;
	}

	public final void setTestSuites(List<TestSuite> testSuites) {
		this.testSuites = testSuites;
	}
}
