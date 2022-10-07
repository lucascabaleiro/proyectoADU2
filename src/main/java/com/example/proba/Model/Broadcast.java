package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Broadcast{

	@JsonProperty("string")
	private String string;

	@JsonProperty("timezone")
	private String timezone;

	@JsonProperty("time")
	private String time;

	@JsonProperty("day")
	private String day;

	public String getString(){
		return string;
	}

	public String getTimezone(){
		return timezone;
	}

	public String getTime(){
		return time;
	}

	public String getDay(){
		return day;
	}

	@Override
 	public String toString(){
		return 
			"Broadcast{" + 
			"string = '" + string + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",time = '" + time + '\'' + 
			",day = '" + day + '\'' + 
			"}";
		}
}