package ru.savkk.study.guice;

import com.google.inject.Inject;
import ru.savkk.study.guice.dataprovider.DataProvider;

public class Configurer {
    @Inject
    private DataProvider dataProvider;

    public String getBaseUrl() {
        return dataProvider.get("baseUrl");
    }

}
