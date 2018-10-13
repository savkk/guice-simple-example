package ru.savkk.study.guice.dataprovider;

public class PropertyDataProvider implements DataProvider {
    public String get(String key) {
        return "Property";
    }
}
