package com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.request_factory;

import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.HttpMethod;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class HttpRequestFactoryImpl implements HttpRequestFactory {
    @Override
    public HttpURLConnection createRequest(String path, HttpMethod httpMethod,
                                           Map<String, String> headers, String body) {
        try {
            URL url = new URI(path).toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            String method = httpMethod.name();
            connection.setRequestMethod(method);

            if (headers != null && !headers.isEmpty()) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    connection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }

            if (body != null
                    && !body.isBlank()
                    && ("POST".equals(method) || "PUT".equals(method))) {
                connection.setDoOutput(true);

                try (OutputStream outputStream = connection.getOutputStream()) {
                    outputStream.write(body.getBytes(StandardCharsets.UTF_8));
                }
            }

            return connection;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
