package com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.response_handler;

import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.dto.Response;

public class ResponseHandlerWithClientError implements ResponseHandler {
    private ResponseHandler nextHandler;

    public ResponseHandlerWithClientError() {
    }

    public ResponseHandlerWithClientError(ResponseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Response response) {
        if (response.code() >= 400 && response.code() <= 499) {
            System.err.println("Client error with response code: " + response.code());
            System.err.println("Error message: " + response.message());
        } else if (nextHandler != null) {
            nextHandler.handle(response);
        }
    }
}
