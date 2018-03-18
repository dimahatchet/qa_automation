package com.swapi.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Vehicles implements Serializable {
    private String name;
    private String model;
    @SerializedName("vehicle_class")
    private String vehicleClass;
    private String manufacturer;
    @SerializedName("cost_in_credits")
    private String costInCredits;
    private String length;
    private String crew;
    private String passengers;
    @SerializedName("max_atmosphering_speed")
    private String maxAtmospheringSpeed;
    @SerializedName("cargo_capacity")
    private String cargoCapacity;
    private String consumables;
    private String created;
    private String edited;
    private String url;
    @SerializedName("pilots")
    private ArrayList<String> pilotsUrls;
    @SerializedName("films")
    private ArrayList<String> filmsUrls;
}
