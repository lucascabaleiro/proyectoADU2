package com.example.proba.Model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
public class Response implements Serializable{

	@JsonProperty("pagination")
	private Pagination pagination;

	@JsonProperty("data")
	private List<DataItem> data;

	@JsonProperty("meta")
	private Meta meta;

	@JsonProperty("links")
	private Links links;

	public Pagination getPagination(){
		return pagination;
	}

	public List<DataItem> getData(){
		return data;
	}

	public Meta getMeta(){
		return meta;
	}

	public Links getLinks(){
		return links;
	}
}