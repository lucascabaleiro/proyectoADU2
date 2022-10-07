package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Prop{

	@JsonProperty("from")
	private From from;

	@JsonProperty("to")
	private To to;

	public From getFrom(){
		return from;
	}

	public To getTo(){
		return to;
	}

	@Override
 	public String toString(){
		return 
			"Prop{" + 
			"from = '" + from + '\'' + 
			",to = '" + to + '\'' + 
			"}";
		}
}