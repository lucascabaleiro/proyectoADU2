package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
public class Prop implements Serializable{

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
}