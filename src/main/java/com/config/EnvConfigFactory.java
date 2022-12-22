package com.config;

import org.aeonbits.owner.ConfigFactory;

public class EnvConfigFactory {
    public static EnvConfig getConfiguration() {
        return ConfigFactory.create(EnvConfig.class);
    }
}
