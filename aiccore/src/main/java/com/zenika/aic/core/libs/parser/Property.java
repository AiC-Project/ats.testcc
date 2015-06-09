package com.zenika.aic.core.libs.parser;

import org.simpleframework.xml.Attribute;

public class Property {
	
	@Attribute
	protected String name;
	
	@Attribute
	protected String value;
	
	public Property(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
