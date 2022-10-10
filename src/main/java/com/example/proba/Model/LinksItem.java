package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LinksItem{

	@JsonProperty("active")
	private boolean active;

	@JsonProperty("label")
	private String label;

	@JsonProperty("url")
	private Object url;

	public boolean isActive(){
		return active;
	}

	public String getLabel(){
		return label;
	}

	public Object getUrl(){
		return url;
	}
}