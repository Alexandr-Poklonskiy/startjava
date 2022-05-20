package com.startjava.graduation.project;

public class Book {
    private String title;
    private String author;
    private String publishYear;

    public String getTitle() {
        return title;
    }

    public Book(String title, String author, String publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public void showBook() {
        System.out.println(title + ", " + author + ", " + publishYear + ".");
    }
}
