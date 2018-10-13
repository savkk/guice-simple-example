package ru.savkk.study.guice;

import com.google.inject.Inject;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import ru.savkk.study.guice.config.TestModule;

@Guice(modules = TestModule.class)
public class ConfigurerTest {

    @Inject
    private Configurer configurer;

    @Test
    public void getBaseUrl() {
        Assert.assertEquals("Mock", configurer.getBaseUrl());
    }

}