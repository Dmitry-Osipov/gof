package com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.request_factory;

import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.HttpMethod;

import java.net.HttpURLConnection;
import java.util.Map;

public interface HttpRequestFactory {
    HttpURLConnection createRequest(String url, HttpMethod method, Map<String, String> headers, String body);
}
