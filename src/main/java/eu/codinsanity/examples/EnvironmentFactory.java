package eu.codinsanity.examples;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

public class EnvironmentFactory {
    @CdisEnvironment
    @Produces
    public String getEnvironment() {
        return "DEV";
    }
}
