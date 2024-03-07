package eu.codinsanity.examples;

import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.UUID;

public class CdisClient {
    @Inject
    private PropertyReader propertyReader;
    @Inject
    @Named("AppApi")
    private AppApi appApi;


    public void delete(UUID uuid) {
        System.out.println(String.format("Deleting %s in environment %s", uuid, appApi.getEnvironment()));
    }

    public void setAppApi(@Named("AppApi") AppApi appApi) {
        this.appApi = appApi;
    }
}
