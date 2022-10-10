package com.example.proba.Model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

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