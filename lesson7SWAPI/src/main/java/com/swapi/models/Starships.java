package com.swapi.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Starships extends Vehicles implements Serializable{

    @SerializedName("starship_class")
    private String starshipClass;

    @SerializedName("hyperdrive_rating")
    private String hyperdriveRating;

    @SerializedName("MGLT")
    private String mglt;
}
