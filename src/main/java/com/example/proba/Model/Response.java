package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("data")
	public Data data;

	public Data getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"data = '" + data + '\'' + 
			"}";
		}
}