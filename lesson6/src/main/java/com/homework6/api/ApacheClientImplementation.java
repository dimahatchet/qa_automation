package com.homework6.api;

import io.restassured.internal.http.URIBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

public class ApacheClientImplementation implements MyCalculatorApiClient {

    private static final String BASE_URI = "http://localhost:8080/lesson4_2/evaluate";


    public String getEvaluate(String expression) {
        URI uri = URI.create(BASE_URI + "?" + expression);
        HttpGet request = new HttpGet(uri);
        try (CloseableHttpResponse response = HttpClientBuilder.create().build().execute(request)) {
            if (response.getStatusLine().getStatusCode() != 200) {
                return null;
            }
            if (response.getEntity().getContentLength() > 0) {
                BufferedReader rd = new BufferedReader(
                        new InputStreamReader(response.getEntity().getContent()));

                StringBuilder result = new StringBuilder();
                String line;
                while ((line = rd.readLine()) != null) {
                    result.append(line);
                }
                return result.toString();
            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
