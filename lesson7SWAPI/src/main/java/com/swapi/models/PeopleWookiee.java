package com.swapi.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class PeopleWookiee implements Serializable {

    @SerializedName("whrascwo")
    private String name;

    @SerializedName("birth_year")
    private String birthYear;

    @SerializedName("films")
    private ArrayList<String> filmsUrls;

    private String gender;

    @SerializedName("acraahrc_oaooanoorc")
    private String hairColor;

    @SerializedName("acwoahrracao")
    private String height;

    @SerializedName("homeworld")
    private String homeWorldUrl;

    @SerializedName("scracc")
    private String mass;

    @SerializedName("skin_color")
    private String skinColor;

    private String created;

    private String edited;

    private String url;

    @SerializedName("species")
    private ArrayList<String> speciesUrls;

    @SerializedName("starships")

    private ArrayList<String> starshipsUrls;
    @SerializedName("vehicles")
    private ArrayList<String> vehiclesUrls;

    public String gethomeWorldUrl() {
        return homeWorldUrl;
    }
    public String getName() {
        return name;
    }
}
