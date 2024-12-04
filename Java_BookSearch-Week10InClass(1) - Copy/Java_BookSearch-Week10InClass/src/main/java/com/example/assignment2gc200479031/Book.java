package com.example.assignment2gc200479031;

import com.google.gson.annotations.SerializedName;

public class Book {

    @SerializedName("id")
    protected String bookId;

    @SerializedName("volumeInfo")
    private BookDetail bookDetail;

    public String getBookId() {
        return bookId;
    }

    public BookDetail getBookDetail() {
        return bookDetail;
    }

    public String toString(){
        return this.getBookId();
    }


}
