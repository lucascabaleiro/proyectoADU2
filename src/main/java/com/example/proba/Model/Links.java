package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links{

	@JsonProperty("next")
	private String next;

	@JsonProperty("last")
	private String last;

	@JsonProperty("prev")
	private Object prev;

	@JsonProperty("first")
	private String first;

	public String getNext(){
		return next;
	}

	public String getLast(){
		return last;
	}

	public Object getPrev(){
		return prev;
	}

	public String getFirst(){
		return first;
	}
}