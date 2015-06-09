package com.zenika.aic.core.libs.parser;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class Failure {
	@Attribute
	protected String message;
	
	@Attribute
	protected String type;
	
	@Text
	protected String content;	
	
	public Failure() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
