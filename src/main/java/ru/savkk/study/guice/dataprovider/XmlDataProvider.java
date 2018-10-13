package ru.savkk.study.guice.dataprovider;

public class XmlDataProvider implements DataProvider {
    public String get(String key) {
        return "Xml";
    }
}
