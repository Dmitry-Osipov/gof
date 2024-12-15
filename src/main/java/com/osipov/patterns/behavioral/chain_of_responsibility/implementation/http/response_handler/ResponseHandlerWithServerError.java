package com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.response_handler;

import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.dto.Response;

public class ResponseHandlerWithServerError implements ResponseHandler {
    private ResponseHandler nextHandler;

    public ResponseHandlerWithServerError() {
    }

    public ResponseHandlerWithServerError(ResponseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Response response) {
        if (response.code() >= 500 && response.code() <= 599) {
            System.err.println("Server error with code " + response.code());
            System.err.println("Server error message: " + response.message());
        } else if (nextHandler != null) {
            nextHandler.handle(response);
        }
    }
}
