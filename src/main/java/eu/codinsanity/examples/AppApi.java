package eu.codinsanity.examples;

import jakarta.inject.Inject;

public class AppApi {
    private final String environment;

    public AppApi(String environment) {
        this.environment = environment;
    }

    public String getEnvironment() {
        return environment;
    }
}
