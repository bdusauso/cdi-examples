package eu.codinsanity.examples;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

public class EnvironmentFactory {
    @Produces
    @Named("Environment")
    public String getEnvironment() {
        return "DEV";
    }
}
