package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class To{

	@JsonProperty("month")
	private Object month;

	@JsonProperty("year")
	private Object year;

	@JsonProperty("day")
	private Object day;

	public Object getMonth(){
		return month;
	}

	public Object getYear(){
		return year;
	}

	public Object getDay(){
		return day;
	}
}