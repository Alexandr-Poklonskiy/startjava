package com.startjava.graduation.project;

public class Bookshelf {
    private Book[] shelf = new Book[10];
    private int numBooks = 0;

    public int getShelfLength() {
        return shelf.length;
    }

    public int getNumBooks() {
        return numBooks;
    }

    public void setBook(Book newBook) {
        shelf[numBooks] = newBook;
        numBooks++;
    }

    public void showShelf() {
        System.out.println();
        for(Book book : shelf) {
            if(book != null) {
                System.out.print("[K]");
            } else {
                System.out.print("[]");
            }
        }
        System.out.println();
        for(int i = 0; i < numBooks; i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(shelf[i]);
        }
    }

    public void deleteBook(int position) {
        if(position > numBooks) {
            System.out.println("Это место свободно.");
            return;
        }
        if(position < numBooks) {
            System.arraycopy(shelf, position, shelf, position - 1, numBooks - position);
        }
        shelf[numBooks - 1] = null;
        numBooks--;
    }

    public void move(int bookPosition, int destination) {
        Book temp = shelf[bookPosition - 1];
        if(bookPosition > destination) {
            System.arraycopy(shelf, destination - 1, shelf, destination, bookPosition - destination);
        } else {
            System.arraycopy(shelf, bookPosition, shelf, bookPosition - 1, destination - bookPosition);
        }
        shelf[destination - 1] = temp;
    }

    public String find(String title) {
        String result = "Книга не найдена.";
        for(int i = 0; i < numBooks; i++) {
            if(title.equals(shelf[i].getTitle())) {
                result = "Книга находится на " + (i + 1) + " позиции";
                break;
            }
        }
        return result;
    }
}
