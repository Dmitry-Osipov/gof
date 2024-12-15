package com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.request_manager;

import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.HttpMethod;
import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.dto.Response;
import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.request_factory.HttpRequestFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class RequestManagerImpl implements RequestManager {
    private final HttpRequestFactory requestFactory;

    public RequestManagerImpl(HttpRequestFactory requestFactory) {
        this.requestFactory = requestFactory;
    }

    @Override
    public Response doGet(String url) {
        HttpURLConnection connection = requestFactory.createRequest(url, HttpMethod.GET, null, null);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }

            return new Response(connection.getResponseCode(), builder.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
