package com.swapi.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class People implements Serializable {

    public String getName() {
        return name;
    }

    private String name;
    @SerializedName("birth_year")
    private String birthYear;
    @SerializedName("films")
    private ArrayList<String> filmsUrls;
    private String gender;
    @SerializedName("hair_color")
    private String hairColor;
    private String height;
    @SerializedName("homeworld")
    private String homeWorldUrl;
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
}
