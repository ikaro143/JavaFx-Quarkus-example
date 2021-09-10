package com.quarkusjavafx.example.applauncher;


import com.quarkusjavafx.example.components.MainUI;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.enterprise.event.Observes;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StageInitializer {

    private static final Logger logger = LoggerFactory.getLogger(StageInitializer.class);

    @SneakyThrows
    public void start(@Observes @StartupScene Stage stage){
        // Start the user interface
        try {
            stage.setTitle("This is an example of JavaFX & SpringBoot");

            Scene scene = new Scene(new MainUI(),
                    Color.web("#666970"));
            stage.setScene(scene);
            stage.show();

        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }
}
