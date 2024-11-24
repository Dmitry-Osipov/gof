package com.osipov.patterns.structural.adapter.implementation;

import com.osipov.patterns.structural.adapter.implementation.log.json.JsonLogProcessor;
import com.osipov.patterns.structural.adapter.implementation.log.json.JsonLogProcessorImpl;
import com.osipov.patterns.structural.adapter.implementation.log.json.XmlToJsonAdapter;
import com.osipov.patterns.structural.adapter.implementation.log.xml.XmlLogProcessorImpl;

public class Main {
    public static void main(String[] args) {
        String json = """
                {
                    "name": "Andy",
                    "age": 12
                }
                """;
        JsonLogProcessor jsonLogProcessor = new JsonLogProcessorImpl();
        jsonLogProcessor.processLog(json);
        XmlToJsonAdapter adapter = new XmlToJsonAdapter(new XmlLogProcessorImpl());
        adapter.processLog(json);
    }
}
