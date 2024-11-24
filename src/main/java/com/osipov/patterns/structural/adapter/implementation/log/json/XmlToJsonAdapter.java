package com.osipov.patterns.structural.adapter.implementation.log.json;

import com.osipov.patterns.structural.adapter.implementation.log.xml.XmlLogProcessor;

public class XmlToJsonAdapter implements JsonLogProcessor {
    private final XmlLogProcessor xmlProcessor;

    public XmlToJsonAdapter(XmlLogProcessor xmlProcessor) {
        this.xmlProcessor = xmlProcessor;
    }

    @Override
    public void processLog(String jsonLog) {
        xmlProcessor.processXmlLog(convertJsonToXml(jsonLog));
    }

    private String convertJsonToXml(String json) {
        StringBuilder source = new StringBuilder(json);
        deleteChars(source, new char[] {'{', '}', '"', ' ', '\n', '\t'});
        return convertDataToXml(source.toString()).toString();
    }

    private void deleteChars(StringBuilder builder, char[] characters) {
        for (char character : characters) {
            int index;
            while ((index = builder.indexOf(String.valueOf(character))) != -1) {
                builder.deleteCharAt(index);
            }
        }
    }

    private StringBuilder convertDataToXml(String preparedJson) {
        StringBuilder xml = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<log>\n");
        String[] lines = preparedJson.split(",");
        for (String line : lines) {
            String[] pair = line.split(":");
            xml
                    .append("\t<data name=\"")
                    .append(pair[0])
                    .append("\" value=\"")
                    .append(pair[1])
                    .append("\" />\n");
        }
        xml.append("</log>");

        return xml;
    }
}
