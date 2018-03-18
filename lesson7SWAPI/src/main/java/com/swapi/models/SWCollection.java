package com.swapi.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class SWCollection<T> implements Serializable {

    private int count;
    private List<T> results;
    @SerializedName("next")
    private String nextPageUrl;
    @SerializedName("previous")
    private String previousPageUrl;

    public boolean hasNextPage() {
        return (nextPageUrl != null && nextPageUrl.length()!=0);
    }
    public boolean hasPreviousPage() {
        return (previousPageUrl != null && previousPageUrl.length()!=0);
    }

    public int getCount() {
        return count;
    }
}
