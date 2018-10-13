package ru.savkk.study.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import ru.savkk.study.guice.config.ApplicationModule;

public class Application {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ApplicationModule());
        Configurer configurer = injector.getInstance(Configurer.class);
        System.out.println(configurer.getBaseUrl());
    }
}
