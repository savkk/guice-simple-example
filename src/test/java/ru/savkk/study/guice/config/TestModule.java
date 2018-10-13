package ru.savkk.study.guice.config;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import ru.savkk.study.guice.dataprovider.DataProvider;
import ru.savkk.study.guice.mocks.MockDataProvider;

public class TestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DataProvider.class).to(MockDataProvider.class).in(Scopes.SINGLETON);
    }
}
