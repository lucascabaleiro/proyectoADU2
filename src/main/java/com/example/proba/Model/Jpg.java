package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Jpg{

	@JsonProperty("large_image_url")
	private String largeImageUrl;

	@JsonProperty("small_image_url")
	private String smallImageUrl;

	@JsonProperty("image_url")
	private String imageUrl;

	public String getLargeImageUrl(){
		return largeImageUrl;
	}

	public String getSmallImageUrl(){
		return smallImageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}
}