package com.osipov.patterns.structural.adapter.implementation.log.xml;

public class XmlLogProcessorImpl implements XmlLogProcessor {

    @Override
    public void processXmlLog(String xmlLg) {
        System.out.println("Processing XML log: \n" + xmlLg);
    }
}
