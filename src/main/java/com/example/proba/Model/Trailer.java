package com.example.proba.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
public class Trailer implements Serializable{

	@JsonProperty("images")
	private Images images;

	@JsonProperty("embed_url")
	private Object embedUrl;

	@JsonProperty("youtube_id")
	private Object youtubeId;

	@JsonProperty("url")
	private Object url;

	public Images getImages(){
		return images;
	}

	public Object getEmbedUrl(){
		return embedUrl;
	}

	public Object getYoutubeId(){
		return youtubeId;
	}

	public Object getUrl(){
		return url;
	}
}