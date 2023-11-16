package com.logi.dashboard.infra.http;

import com.google.gson.Gson;
import com.logi.dashboard.infra.entity.Response;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ProductHttpClient {


    private final HttpClient httpClient;
    private final Gson gson;
    private final String url;

    public ProductHttpClient(HttpClient httpClient, Gson gson, String url) {
        this.httpClient = httpClient;
        this.gson = gson;
        this.url = url;
    }


    public Response findAll(Integer limit, Integer skip) throws URISyntaxException, IOException, InterruptedException {
        HttpResponse<String> response = httpClient.send(HttpRequest.newBuilder()
                        .uri(new URI(String.format(this.url + "/products?limit=%s&skip=%s", limit, skip)))
                        .GET()
                        .build()
                , HttpResponse.BodyHandlers.ofString());

        return gson.fromJson(response.body(), Response.class);
    }
}
