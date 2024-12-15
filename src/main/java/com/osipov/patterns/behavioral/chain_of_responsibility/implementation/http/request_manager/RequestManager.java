package com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.request_manager;

import com.osipov.patterns.behavioral.chain_of_responsibility.implementation.http.dto.Response;

public interface RequestManager {
    Response doGet(String url);
}
