package com.example.assignment2gc200479031;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class BookDetailsViewController {

    @FXML
    private Label authorsLabel;

    @FXML
    private Label averageRatingLabel;

    @FXML
    private Button backButton;

    @FXML
    private Label bookTitleLabel;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private ImageView imageView;

    @FXML
    private Label languageLabel;

    @FXML
    private Label pageCount;

    @FXML
    private Label publishedDateLabel;

    @FXML
    private Label publisherLabel;

    @FXML
    private Label ratingCountLabel;

    private BookDetail bookDetail;

    public void loadBookDetails(BookDetail bookDetail) {
        /*bookDetail is nested in ApiResponse ->Book(array) -> BookDetails,
        information already included in the generated file last time
         */
        //ApiResponse apiResponse = APIUtility.getBooksFromJSONFile("javaApiFetched.json");
        //search id from books
        /*for(Book book : apiResponse.getItems()) {
            if(book.getId().equals(id)) {
                System.out.println("in details view controller" + book.getId());
                bookDetail = book.getBookDetail();
            }
        }*/

        //load more Book Details info based on the current displayed bookDetail instance
        System.out.println("from detail controller" + bookDetail);

        bookTitleLabel.setText(bookDetail.getTitle());
        try {
            authorsLabel.setText(bookDetail.getAuthors());
        }
        catch(NullPointerException e){
            authorsLabel.setText("");
        }
        languageLabel.setText(bookDetail.getLanguage());
        pageCount.setText(Integer.toString(bookDetail.getPageCount()));
        publishedDateLabel.setText(bookDetail.getPublishedDate());
        publisherLabel.setText(bookDetail.getPublisher());

        //try catch to avoid null value
        try {
            averageRatingLabel.setText(Double.toString(bookDetail.getAverageRating()));
        }
        catch(NullPointerException e){
            averageRatingLabel.setText("No rating");
        }

        try {
            ratingCountLabel.setText(Integer.toString(bookDetail.getRatingsCount()));
        }
        catch(NullPointerException e){
            ratingCountLabel.setText("");
        }

        //set description text area not edible and wrap text

        descriptionTextArea.setText(bookDetail.getDescription());
        descriptionTextArea.setWrapText(true);
        descriptionTextArea.setEditable(false);



        try {
            imageView.setImage(new Image(bookDetail.getImageLinks().getThumbnail()));
        }
        catch(Exception e)
        {
            imageView.setImage(new Image("https://trailerfailure.com/img/images/missingCoverPhoto.jpg"));
        }

    }

    @FXML
    private void loadSearchView(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "search-book-view.fxml");

    }
}
