package com.quarkusjavafx.example.applauncher;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import javafx.application.Application;

public class CDIApplication implements QuarkusApplication {

    public static void main(String[] args) {
        Quarkus.run(CDIApplication.class);
    }

    @Override
    public int run(String... args) {
        Application.launch(AppLauncher.class, args);
        return 0;
    }
}
