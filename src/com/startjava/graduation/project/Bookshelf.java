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
            shelf[i].showBook();
        }
    }

    public void deleteBook(int position) {
        if(position == shelf.length) {
            shelf[position - 1] = null;
        } else {
            System.arraycopy(shelf, position, shelf, position - 1, shelf.length - position);
            shelf[shelf.length - 1] = null;
        }
        numBooks--;
    }

    public void move(int x, int y) {
        Book temp = shelf[x - 1];
        if(x > y) {
            System.arraycopy(shelf, y - 1, shelf, y, x - y);
        } else {
            System.arraycopy(shelf, x, shelf, x - 1, y - x);
        }
        shelf[y - 1] = temp;
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

    public void showNumOfBooks() {
        System.out.println("Количество книг на полке " + numBooks + ". Свободных мест " + (shelf.length - numBooks) + ".");
    }
}
