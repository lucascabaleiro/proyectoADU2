package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination{

	@JsonProperty("has_next_page")
	private boolean hasNextPage;

	@JsonProperty("last_visible_page")
	private int lastVisiblePage;

	@JsonProperty("items")
	private Items items;

	@JsonProperty("current_page")
	private int currentPage;

	public boolean isHasNextPage(){
		return hasNextPage;
	}

	public int getLastVisiblePage(){
		return lastVisiblePage;
	}

	public Items getItems(){
		return items;
	}

	public int getCurrentPage(){
		return currentPage;
	}
}