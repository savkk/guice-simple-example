package ru.savkk.study.guice.dataprovider;

public class ExcelDataProvider implements DataProvider {
    public String get(String key) {
        return "Excel";
    }
}
