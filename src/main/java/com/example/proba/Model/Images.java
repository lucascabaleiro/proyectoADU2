package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Images implements Serializable{

	@JsonProperty("jpg")
	private Jpg jpg;

	@JsonProperty("webp")
	private Webp webp;

	@JsonProperty("large_image_url")
	private Object largeImageUrl;

	@JsonProperty("small_image_url")
	private Object smallImageUrl;

	@JsonProperty("image_url")
	private Object imageUrl;

	@JsonProperty("medium_image_url")
	private Object mediumImageUrl;

	@JsonProperty("maximum_image_url")
	private Object maximumImageUrl;

	public Jpg getJpg(){
		return jpg;
	}

	public Webp getWebp(){
		return webp;
	}

	public Object getLargeImageUrl(){
		return largeImageUrl;
	}

	public Object getSmallImageUrl(){
		return smallImageUrl;
	}

	public Object getImageUrl(){
		return imageUrl;
	}

	public Object getMediumImageUrl(){
		return mediumImageUrl;
	}

	public Object getMaximumImageUrl(){
		return maximumImageUrl;
	}
}