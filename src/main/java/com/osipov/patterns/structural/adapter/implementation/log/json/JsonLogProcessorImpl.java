package com.osipov.patterns.structural.adapter.implementation.log.json;

public class JsonLogProcessorImpl implements JsonLogProcessor {

    @Override
    public void processLog(String jsonLog) {
        System.out.println("Processing JSON log: \n" + jsonLog);
    }
}
