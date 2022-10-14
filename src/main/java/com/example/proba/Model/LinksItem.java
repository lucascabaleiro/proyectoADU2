package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
public class LinksItem implements Serializable{

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