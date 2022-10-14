package com.example.proba.Model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DataItem implements Serializable{

	@JsonProperty("title_japanese")
	private String titleJapanese;

	@JsonProperty("favorites")
	private int favorites;

	@JsonProperty("broadcast")
	private Broadcast broadcast;

	@JsonProperty("year")
	private Object year;

	@JsonProperty("rating")
	private String rating;

	@JsonProperty("scored_by")
	private Object scoredBy;

	@JsonProperty("title_synonyms")
	private List<Object> titleSynonyms;

	@JsonProperty("source")
	private String source;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private String type;

	@JsonProperty("trailer")
	private Trailer trailer;

	@JsonProperty("duration")
	private String duration;

	@JsonProperty("score")
	private Object score;

	@JsonProperty("themes")
	private List<ThemesItem> themes;

	@JsonProperty("approved")
	private boolean approved;

	@JsonProperty("genres")
	private List<GenresItem> genres;

	@JsonProperty("popularity")
	private int popularity;

	@JsonProperty("members")
	private int members;

	@JsonProperty("title_english")
	private String titleEnglish;

	@JsonProperty("rank")
	private int rank;

	@JsonProperty("season")
	private Object season;

	@JsonProperty("airing")
	private boolean airing;

	@JsonProperty("episodes")
	private int episodes;

	@JsonProperty("aired")
	private Aired aired;

	@JsonProperty("images")
	private Images images;

	@JsonProperty("studios")
	private List<Object> studios;

	@JsonProperty("mal_id")
	private int malId;

	@JsonProperty("titles")
	private List<TitlesItem> titles;

	@JsonProperty("synopsis")
	private Object synopsis;

	@JsonProperty("explicit_genres")
	private List<Object> explicitGenres;

	@JsonProperty("licensors")
	private List<Object> licensors;

	@JsonProperty("url")
	private String url;

	@JsonProperty("producers")
	private List<Object> producers;

	@JsonProperty("background")
	private Object background;

	@JsonProperty("status")
	private String status;

	@JsonProperty("demographics")
	private List<DemographicsItem> demographics;

	public String getTitleJapanese(){
		return titleJapanese;
	}

	public int getFavorites(){
		return favorites;
	}

	public Broadcast getBroadcast(){
		return broadcast;
	}

	public Object getYear(){
		return year;
	}

	public String getRating(){
		return rating;
	}

	public Object getScoredBy(){
		return scoredBy;
	}

	public List<Object> getTitleSynonyms(){
		return titleSynonyms;
	}

	public String getSource(){
		return source;
	}

	public String getTitle(){
		return title;
	}

	public String getType(){
		return type;
	}

	public Trailer getTrailer(){
		return trailer;
	}

	public String getDuration(){
		return duration;
	}

	public Object getScore(){
		return score;
	}

	public List<ThemesItem> getThemes(){
		return themes;
	}

	public boolean isApproved(){
		return approved;
	}

	public List<GenresItem> getGenres(){
		return genres;
	}

	public int getPopularity(){
		return popularity;
	}

	public int getMembers(){
		return members;
	}

	public String getTitleEnglish(){
		return titleEnglish;
	}

	public int getRank(){
		return rank;
	}

	public Object getSeason(){
		return season;
	}

	public boolean isAiring(){
		return airing;
	}

	public int getEpisodes(){
		return episodes;
	}

	public Aired getAired(){
		return aired;
	}

	public Images getImages(){
		return images;
	}

	public List<Object> getStudios(){
		return studios;
	}

	public int getMalId(){
		return malId;
	}

	public List<TitlesItem> getTitles(){
		return titles;
	}

	public Object getSynopsis(){
		return synopsis;
	}

	public List<Object> getExplicitGenres(){
		return explicitGenres;
	}

	public List<Object> getLicensors(){
		return licensors;
	}

	public String getUrl(){
		return url;
	}

	public List<Object> getProducers(){
		return producers;
	}

	public Object getBackground(){
		return background;
	}

	public String getStatus(){
		return status;
	}

	public List<DemographicsItem> getDemographics(){
		return demographics;
	}
}