package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
public class Aired implements Serializable{

	@JsonProperty("string")
	private String string;

	@JsonProperty("prop")
	private Prop prop;

	@JsonProperty("from")
	private String from;

	@JsonProperty("to")
	private Object to;

	public String getString(){
		return string;
	}

	public Prop getProp(){
		return prop;
	}

	public String getFrom(){
		return from;
	}

	public Object getTo(){
		return to;
	}
}