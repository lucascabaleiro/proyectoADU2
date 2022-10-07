package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Images{

	@JsonProperty("jpg")
	private Jpg jpg;

	@JsonProperty("webp")
	private Webp webp;

	@JsonProperty("large_image_url")
	private String largeImageUrl;

	@JsonProperty("small_image_url")
	private String smallImageUrl;

	@JsonProperty("image_url")
	private String imageUrl;

	@JsonProperty("medium_image_url")
	private String mediumImageUrl;

	@JsonProperty("maximum_image_url")
	private String maximumImageUrl;

	public Jpg getJpg(){
		return jpg;
	}

	public Webp getWebp(){
		return webp;
	}

	public String getLargeImageUrl(){
		return largeImageUrl;
	}

	public String getSmallImageUrl(){
		return smallImageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public String getMediumImageUrl(){
		return mediumImageUrl;
	}

	public String getMaximumImageUrl(){
		return maximumImageUrl;
	}

	@Override
 	public String toString(){
		return 
			"Images{" + 
			"jpg = '" + jpg + '\'' + 
			",webp = '" + webp + '\'' + 
			",large_image_url = '" + largeImageUrl + '\'' + 
			",small_image_url = '" + smallImageUrl + '\'' + 
			",image_url = '" + imageUrl + '\'' + 
			",medium_image_url = '" + mediumImageUrl + '\'' + 
			",maximum_image_url = '" + maximumImageUrl + '\'' + 
			"}";
		}
}