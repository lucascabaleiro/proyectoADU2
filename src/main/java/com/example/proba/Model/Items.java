package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
public class Items implements Serializable{

	@JsonProperty("per_page")
	private int perPage;

	@JsonProperty("total")
	private int total;

	@JsonProperty("count")
	private int count;

	public int getPerPage(){
		return perPage;
	}

	public int getTotal(){
		return total;
	}

	public int getCount(){
		return count;
	}
}