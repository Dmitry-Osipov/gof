package com.osipov.patterns.behavioral.chain_of_responsibility.implementation;

import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.dto.Response;
import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.request_factory.HttpRequestFactoryImpl;
import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.request_manager.RequestManager;
import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.request_manager.RequestManagerImpl;
import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.response_handler.ResponseHandler;
import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.response_handler.ResponseHandlerStatusOk;
import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.response_handler.ResponseHandlerWithClientError;
import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.response_handler.ResponseHandlerWithServerError;

public class Main {
    public static void main(String[] args) {
        RequestManager manager = new RequestManagerImpl(new HttpRequestFactoryImpl());
        Response response = manager.doGet("http://www.baidu.com");
        ResponseHandler handler = new ResponseHandlerStatusOk(
                new ResponseHandlerWithClientError(
                        new ResponseHandlerWithServerError()
                )
        );
        handler.handle(response);
    }
}
