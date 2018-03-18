package com.swapi.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

public class Species implements Serializable{
    private String name;
    private String classification;
    private String designation;
    @SerializedName("average_height")
    private String averageHeight;
    @SerializedName("average_lifespan")
    private String averageLifespan;
    @SerializedName("eye_colors")
    private String eyeColors;
    @SerializedName("hair_colors")
    private String hairColors;
    @SerializedName("skin_colors")
    private String skinColors;
    @SerializedName("homeworld")
    private String homeWorld;
    private String language;
    private String created;
    private String edited;
    private String url;
    @SerializedName("people")
    private ArrayList<String> peopleUrls;
    @SerializedName("films")
    private ArrayList<String> filmsUrls;
}
