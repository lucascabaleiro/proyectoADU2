package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TitlesItem{

	@JsonProperty("type")
	private String type;

	@JsonProperty("title")
	private String title;

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}
}