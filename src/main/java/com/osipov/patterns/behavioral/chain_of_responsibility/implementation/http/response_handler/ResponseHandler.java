package com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.response_handler;

import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.dto.Response;

public interface ResponseHandler {
    void handle(Response response);
}
