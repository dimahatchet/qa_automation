package com.swapi.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class PeopleWookiee extends People implements Serializable {

    @SerializedName("whrascwo")
    private String name;

    public String getName() {
        return name;
    }
}
