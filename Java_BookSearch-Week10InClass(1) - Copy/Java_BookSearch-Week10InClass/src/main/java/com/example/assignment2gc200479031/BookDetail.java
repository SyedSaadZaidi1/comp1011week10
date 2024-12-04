package com.example.assignment2gc200479031;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.Arrays;

public class BookDetail extends Book {

    private String title, subtitle, publisher, publishedDate, description, language, infoLink;
    private String[] authors, categories;
    private int pageCount, ratingsCount;
    private Double averageRating;
    private ImageLink imageLinks;

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getAuthors() {
        return Arrays.toString(authors).replace("[", "").replace("]", "");
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {

        return (publishedDate != null) ? publishedDate : " ";
    }

    // null coalescing operator to avoid null value
    public String getDescription() {

        return (description != null) ? description : " ";

    }

    public String[] getCategories() {
        return categories;
    }

    public String getLanguage() {
        return (language != null) ? language : " ";
    }

    public String getInfoLink() {

        return (infoLink != null) ? infoLink : " ";

    }

    public int getPageCount() {

        return pageCount;
    }

    public ImageLink getImageLinks() {

        return imageLinks;
    }

    public int getRatingsCount() {
        return ratingsCount;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    //get the title, Year of publishedDate and Authors information to display
    public String toString() {
        //try catch block to avoid null value publishedDate
        try {
            return String.format("%s (%s, %s)", title, getPublishedDate().substring(0, 4), Arrays.toString(authors).replace("[", "").replace("]", ""));
        } catch (StringIndexOutOfBoundsException e) {
             //e.printStackTrace();
            return String.format("%s (%s)", title, Arrays.toString(authors).replace("[", "").replace("]", ""));
        }

    }
}





