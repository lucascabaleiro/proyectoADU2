package com.example.proba.Model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta{

	@JsonProperty("path")
	private String path;

	@JsonProperty("per_page")
	private int perPage;

	@JsonProperty("total")
	private int total;

	@JsonProperty("last_page")
	private int lastPage;

	@JsonProperty("from")
	private int from;

	@JsonProperty("links")
	private List<LinksItem> links;

	@JsonProperty("to")
	private int to;

	@JsonProperty("current_page")
	private int currentPage;

	public String getPath(){
		return path;
	}

	public int getPerPage(){
		return perPage;
	}

	public int getTotal(){
		return total;
	}

	public int getLastPage(){
		return lastPage;
	}

	public int getFrom(){
		return from;
	}

	public List<LinksItem> getLinks(){
		return links;
	}

	public int getTo(){
		return to;
	}

	public int getCurrentPage(){
		return currentPage;
	}
}