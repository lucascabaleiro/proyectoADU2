package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TitlesItem implements Serializable{

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