package com.zenika.aic.core.libs.parser;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class TestCase {
	@Attribute(name="classname")
	protected String className;
	
	@Attribute
	protected String name;
	
	@Attribute(required=false)
	protected String time;
	
	@Element(required=false)
	protected Failure failure;
	
	@Element(required=false)
	protected String error;
	
	public TestCase(String className, String name, String time) {
		this.className = className;
		this.name = name;
		this.time = time;
	}
	
	public TestCase(String className, String name) {
		this.className = className;
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Failure getFailure() {
		return failure;
	}

	public void setFailure(Failure failure) {
		this.failure = failure;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
