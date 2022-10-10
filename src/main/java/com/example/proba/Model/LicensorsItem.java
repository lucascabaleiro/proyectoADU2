package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LicensorsItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("mal_id")
	private int malId;

	@JsonProperty("type")
	private String type;

	@JsonProperty("url")
	private String url;

	public String getName(){
		return name;
	}

	public int getMalId(){
		return malId;
	}

	public String getType(){
		return type;
	}

	public String getUrl(){
		return url;
	}
}