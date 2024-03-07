package eu.codinsanity.examples;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Weld weld = new Weld();
        // Must add current package otherwise the Weld container complains
        // about beans.xml not being there
        weld.addPackages(true, Main.class);

        try (WeldContainer container = weld.initialize()) {
            CdisClient client = container.select(CdisClient.class).get();
            client.delete(UUID.randomUUID());
        }
    }
}