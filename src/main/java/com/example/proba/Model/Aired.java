package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Aired{

	@JsonProperty("string")
	private String string;

	@JsonProperty("prop")
	private Prop prop;

	@JsonProperty("from")
	private String from;

	@JsonProperty("to")
	private String to;

	public String getString(){
		return string;
	}

	public Prop getProp(){
		return prop;
	}

	public String getFrom(){
		return from;
	}

	public String getTo(){
		return to;
	}

	@Override
 	public String toString(){
		return 
			"Aired{" + 
			"string = '" + string + '\'' + 
			",prop = '" + prop + '\'' + 
			",from = '" + from + '\'' + 
			",to = '" + to + '\'' + 
			"}";
		}
}