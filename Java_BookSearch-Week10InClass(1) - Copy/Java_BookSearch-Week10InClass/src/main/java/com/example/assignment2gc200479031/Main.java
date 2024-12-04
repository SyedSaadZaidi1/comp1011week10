package com.example.assignment2gc200479031;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application{

     @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("search-book-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Search Book Database by Title");
        stage.getIcons().add(new Image("file:book-icon.png"));
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch();
//        ApiResponse apiResponse = ApiUtility.getBooksFromJSONFile("javaApiFetch");
//
//        System.out.println(apiResponse);
//
//        ApiResponse apiResponse2 = ApiUtility.getBooksFromOMDB("To kill a mockingbird");
//
//        for(Book book : apiResponse2.getItems()){
//            System.out.println(book.getBookDetail().getTitle());
//        }
    }
}