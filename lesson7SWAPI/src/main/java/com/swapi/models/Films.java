package com.swapi.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Films implements Serializable {
    private String title;
    @SerializedName("episode_id")
    private int episodeId;
    @SerializedName("opening_crawl")
    private String openingCrawl;
    private String director;
    private String producer;
    private String url;
    private String created;
    private String edited;
    @SerializedName("species")
    private ArrayList<String> speciesUrls;
    @SerializedName("starships")
    private ArrayList<String> starshipsUrls;
    @SerializedName("vehicles")
    private ArrayList<String> vehiclesUrls;
    @SerializedName("planets")
    private ArrayList<String> planetsUrls;
    @SerializedName("characters")
    private ArrayList<String> charactersUrls;
}
