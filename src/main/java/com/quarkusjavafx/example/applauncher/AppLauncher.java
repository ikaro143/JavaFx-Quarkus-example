package com.quarkusjavafx.example.applauncher;

import javafx.application.Application;
import javafx.stage.Stage;
import javax.enterprise.inject.spi.CDI;
import javax.enterprise.util.AnnotationLiteral;

public class AppLauncher extends Application {

    @Override
    public void start(Stage primaryStage) {
        CDI.current().getBeanManager().fireEvent(primaryStage, new AnnotationLiteral<StartupScene>() {
        });
    }
}
