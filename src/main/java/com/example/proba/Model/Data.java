package com.example.proba.Model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Data{

	@JsonProperty("title_japanese")
	private String titleJapanese;

	@JsonProperty("favorites")
	private int favorites;

	@JsonProperty("broadcast")
	private Broadcast broadcast;

	@JsonProperty("year")
	private int year;

	@JsonProperty("rating")
	private String rating;

	@JsonProperty("scored_by")
	private int scoredBy;

	@JsonProperty("title_synonyms")
	private List<String> titleSynonyms;

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
	private double score;

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
	private String season;

	@JsonProperty("airing")
	private boolean airing;

	@JsonProperty("episodes")
	private int episodes;

	@JsonProperty("aired")
	private Aired aired;

	@JsonProperty("images")
	private Images images;

	@JsonProperty("studios")
	private List<StudiosItem> studios;

	@JsonProperty("mal_id")
	private int malId;

	@JsonProperty("titles")
	private List<TitlesItem> titles;

	@JsonProperty("synopsis")
	private String synopsis;

	@JsonProperty("explicit_genres")
	private List<Object> explicitGenres;

	@JsonProperty("licensors")
	private List<LicensorsItem> licensors;

	@JsonProperty("url")
	private String url;

	@JsonProperty("producers")
	private List<ProducersItem> producers;

	@JsonProperty("background")
	private String background;

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

	public int getYear(){
		return year;
	}

	public String getRating(){
		return rating;
	}

	public int getScoredBy(){
		return scoredBy;
	}

	public List<String> getTitleSynonyms(){
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

	public double getScore(){
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

	public String getSeason(){
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

	public List<StudiosItem> getStudios(){
		return studios;
	}

	public int getMalId(){
		return malId;
	}

	public List<TitlesItem> getTitles(){
		return titles;
	}

	public String getSynopsis(){
		return synopsis;
	}

	public List<Object> getExplicitGenres(){
		return explicitGenres;
	}

	public List<LicensorsItem> getLicensors(){
		return licensors;
	}

	public String getUrl(){
		return url;
	}

	public List<ProducersItem> getProducers(){
		return producers;
	}

	public String getBackground(){
		return background;
	}

	public String getStatus(){
		return status;
	}

	public List<DemographicsItem> getDemographics(){
		return demographics;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"title_japanese = '" + titleJapanese + '\'' + 
			",favorites = '" + favorites + '\'' + 
			",broadcast = '" + broadcast + '\'' + 
			",year = '" + year + '\'' + 
			",rating = '" + rating + '\'' + 
			",scored_by = '" + scoredBy + '\'' + 
			",title_synonyms = '" + titleSynonyms + '\'' + 
			",source = '" + source + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",trailer = '" + trailer + '\'' + 
			",duration = '" + duration + '\'' + 
			",score = '" + score + '\'' + 
			",themes = '" + themes + '\'' + 
			",approved = '" + approved + '\'' + 
			",genres = '" + genres + '\'' + 
			",popularity = '" + popularity + '\'' + 
			",members = '" + members + '\'' + 
			",title_english = '" + titleEnglish + '\'' + 
			",rank = '" + rank + '\'' + 
			",season = '" + season + '\'' + 
			",airing = '" + airing + '\'' + 
			",episodes = '" + episodes + '\'' + 
			",aired = '" + aired + '\'' + 
			",images = '" + images + '\'' + 
			",studios = '" + studios + '\'' + 
			",mal_id = '" + malId + '\'' + 
			",titles = '" + titles + '\'' + 
			",synopsis = '" + synopsis + '\'' + 
			",explicit_genres = '" + explicitGenres + '\'' + 
			",licensors = '" + licensors + '\'' + 
			",url = '" + url + '\'' + 
			",producers = '" + producers + '\'' + 
			",background = '" + background + '\'' + 
			",status = '" + status + '\'' + 
			",demographics = '" + demographics + '\'' + 
			"}";
		}
}