package com.swapi.api.engine;


import com.swapi.api.models.ApiHttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;

public class ApacheRestApiEngine implements RestApiEngine {

    @Override
    public ApiHttpResponse get(final String url)
    {
        ApiHttpResponse apiResponse = new ApiHttpResponse();
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(URI.create(url));

        try(CloseableHttpResponse httpResponse = client.execute(request)){
apiResponse.setStatusCode(httpResponse.getStatusLine().getStatusCode());
apiResponse.setStatusMessage(httpResponse.getStatusLine().getReasonPhrase());
            final StringBuilder bodyBuilder = new StringBuilder();

            try(InputStream in = httpResponse.getEntity().getContent()){
                BufferedReader rd = new BufferedReader(new InputStreamReader(in));
                String line;
                while ((line = rd.readLine()) != null) {
                    bodyBuilder.append(line);
                }

            }
            apiResponse.setBody(bodyBuilder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return apiResponse;
    }
}
