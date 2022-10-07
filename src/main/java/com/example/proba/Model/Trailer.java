package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Trailer{

	@JsonProperty("images")
	private Images images;

	@JsonProperty("embed_url")
	private String embedUrl;

	@JsonProperty("youtube_id")
	private String youtubeId;

	@JsonProperty("url")
	private String url;

	public Images getImages(){
		return images;
	}

	public String getEmbedUrl(){
		return embedUrl;
	}

	public String getYoutubeId(){
		return youtubeId;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Trailer{" + 
			"images = '" + images + '\'' + 
			",embed_url = '" + embedUrl + '\'' + 
			",youtube_id = '" + youtubeId + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}