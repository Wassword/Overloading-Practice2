package org.example.books;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;


    //Constructor with all parameters
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;

    }
    //Constructor with 2 parameters
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = 0;
    }

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.pages = 0;
        this.publicationYear = 0;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Pages: " + getPages() + ", Year: " + getPublicationYear();
    }

}
