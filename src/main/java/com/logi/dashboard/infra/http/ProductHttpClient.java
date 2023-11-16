package com.logi.dashboard.infra.http;

import com.google.gson.Gson;
import com.logi.dashboard.infra.entity.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class ProductHttpClient {

    private String url;
    private final HttpClient httpClient;
    private final Gson gson;

    public ProductHttpClient(HttpClient httpClient, Gson gson) {
        this.httpClient = httpClient;
        this.gson = gson;
    }

    public ProductHttpClient() {
        this.httpClient = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public Response findAll(Integer limit, Integer skip) throws URISyntaxException, IOException, InterruptedException {
        HttpResponse<String> response = httpClient.send(HttpRequest.newBuilder()
                        .uri(new URI(String.format("https://dummyjson.com/products?limit=%s&skip=%s", limit, skip)))
                        .GET()
                        .build()
                , HttpResponse.BodyHandlers.ofString());

        return gson.fromJson(response.body(), Response.class);
    }
}
