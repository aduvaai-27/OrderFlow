package com.orderflow;

import com.orderflow.db.DatabaseConnection;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        DatabaseConnection.getConnection();

        StackPane root = new StackPane();
        Scene scene = new Scene(root, 1000, 650);

        stage.setTitle("OrderFlow");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        DatabaseConnection.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
