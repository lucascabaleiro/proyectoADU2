package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class From{

	@JsonProperty("month")
	private int month;

	@JsonProperty("year")
	private int year;

	@JsonProperty("day")
	private int day;

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	public int getDay(){
		return day;
	}

	@Override
 	public String toString(){
		return 
			"From{" + 
			"month = '" + month + '\'' + 
			",year = '" + year + '\'' + 
			",day = '" + day + '\'' + 
			"}";
		}
}