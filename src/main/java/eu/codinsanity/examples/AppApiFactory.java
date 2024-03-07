package eu.codinsanity.examples;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

public class AppApiFactory {
    @Produces
    @Named("AppApi")
    public AppApi getAppApi(@Named("Environment") String environment) {
        return new AppApi(environment);
    }
}
