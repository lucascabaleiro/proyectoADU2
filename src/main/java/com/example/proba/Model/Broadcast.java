package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Broadcast implements Serializable{

	@JsonProperty("string")
	private Object string;

	@JsonProperty("timezone")
	private Object timezone;

	@JsonProperty("time")
	private Object time;

	@JsonProperty("day")
	private Object day;

	public Object getString(){
		return string;
	}

	public Object getTimezone(){
		return timezone;
	}

	public Object getTime(){
		return time;
	}

	public Object getDay(){
		return day;
	}
}