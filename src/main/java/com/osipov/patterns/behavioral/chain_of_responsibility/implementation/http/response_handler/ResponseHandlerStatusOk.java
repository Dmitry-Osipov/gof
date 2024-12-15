package com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.response_handler;

import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.dto.Response;

public class ResponseHandlerStatusOk implements ResponseHandler {
    private ResponseHandler nextHandler;

    public ResponseHandlerStatusOk() {
    }

    public ResponseHandlerStatusOk(ResponseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Response response) {
        if (response.code() >= 200 && response.code() <= 299) {
            System.out.println("Response is OK: " + response.code());
            System.out.println("Response message:\n" + response.message());
        } else if (nextHandler != null) {
            nextHandler.handle(response);
        }
    }
}
