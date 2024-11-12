package com.example.iterator;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;


public class HelloApplication extends Application {
    @FXML
    public static ImageView imageView;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 429);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        //button = new Button(resourceBundle.getString("hello"));

    }

    public static void main(String[] args) {
        launch();
        // Создаем временную шкалу
        //Timeline timeline = new Timeline();

        // Устанавливаем бесконечное количество повторений
        //timeline.setCycleCount(Timeline.INDEFINITE);

        // Добавляем ключевые кадры
        //for (int i = 100; i <= 500; i += 100) {
        //    addKeyFrame(timeline, i);
        //}

        // Запускаем анимацию
        //timeline.play();
    }
    /*private static void addKeyFrame(Timeline timeline, int durationMillis) {
        Duration duration = Duration.millis(durationMillis);
        ConcreteAggregate conaggr = new ConcreteAggregate("jpg");

        Iterator iter = conaggr.getIterator();
        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (iter.hasNext(1))
                    imageView.setImage((Image)
                            iter.next());


            }
        };
        timeline.getKeyFrames().add(new KeyFrame(duration, handler));
    }*/
}