package com.swapi.models;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Planets implements Serializable {
    private String name;
    private String diameter;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;
    private String created;
    private String edited;
    private String url;
    @SerializedName("rotation_period")
    private String rotationPeriod;
    @SerializedName("orbital_period")
    private String orbitalPeriod;
    @SerializedName("surface_water")
    private String surfaceWater;
    @SerializedName("residents")
    private ArrayList<String> residentsUrls;
    @SerializedName("films")
    private ArrayList<String> filmsUrls;
}
