package ru.savkk.study.guice.mocks;

import ru.savkk.study.guice.dataprovider.DataProvider;

public class MockDataProvider implements DataProvider {
    public String get(String key) {
        return "Mock";
    }
}
