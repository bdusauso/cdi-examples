package eu.codinsanity.examples;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

public class AppApiFactory {
    @Produces
    @Named("AppApi")
    public AppApi getAppApi(@CdisEnvironment String environment) {
        return new AppApi(environment);
    }
}
