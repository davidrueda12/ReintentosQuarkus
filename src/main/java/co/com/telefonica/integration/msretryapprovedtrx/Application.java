package co.com.telefonica.integration.msretryapprovedtrx;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

/**
 *
 * @author Red Hat
 *
 */
@QuarkusMain
public class Application {


    public static void main(String... args) {
        Quarkus.run(ApplicationMainService.class, args);
    }

}