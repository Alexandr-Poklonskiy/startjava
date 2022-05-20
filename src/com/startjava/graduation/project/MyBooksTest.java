package com.startjava.graduation.project;

import java.util.Scanner;

public class MyBooksTest {
    public static void main(String[] args) {
        Bookshelf myBooks = new Bookshelf();
        System.out.println("Моя книжная полка");
        myBooks.showShelf();
        String answer;
        do {
            System.out.println("1. Добавить.\n2. Удалить\n3. Переместить\n4. Найти\n5. " + "Количество книг и свободного места");
            System.out.print("Введите номер команды: ");
            Scanner scan = new Scanner(System.in);
            int command = scan.nextInt();
            scan.nextLine();
            switch(command) {
                case 1:
                    if(myBooks.getNumBooks() == myBooks.getShelfLength()) {
                        System.out.println("Нет свободного места.");
                    } else {
                        System.out.print("Введите название книги: ");
                        String title = scan.nextLine();
                        System.out.print("Автор: ");
                        String author = scan.nextLine();
                        System.out.print("Год издания: ");
                        String publishYear = scan.nextLine();
                        Book newBook = new Book(title, author, publishYear);
                        myBooks.setBook(newBook);
                    }
                    break;
                case 2:
                    System.out.print("Введите номер книги: ");
                    myBooks.deleteBook(scan.nextInt());
                    scan.nextLine();
                    break;
                case 3:
                    System.out.print("Введите номер книги: ");
                    int bookPosition = scan.nextInt();
                    System.out.print("Номер позиции куда переместить: ");
                    int destination = scan.nextInt();
                    scan.nextLine();
                    myBooks.move(bookPosition, destination);
                    break;
                case 4:
                    System.out.print("Введите название книги: ");
                    System.out.println(myBooks.find(scan.nextLine()));
                    break;
                case 5:
                    myBooks.showNumOfBooks();
                    break;
                default:
                    System.out.println("Такой команды нет.");

            }
            myBooks.showShelf();
            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answer = scan.nextLine();
            } while(!answer.equals("no") && !answer.equals("yes"));
        } while(answer.equals("yes"));
    }
}
