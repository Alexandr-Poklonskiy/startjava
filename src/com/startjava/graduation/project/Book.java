package com.startjava.graduation.project;

public class Book {
    private String title;
    private String author;
    private String publishYear;

    public Book(String title, String author, String publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public void showBook() {
        System.out.println(title + ", " + author + ", " + publishYear + ".");
    }
}
