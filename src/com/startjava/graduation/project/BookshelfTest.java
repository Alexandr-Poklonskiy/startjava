package com.startjava.graduation.project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf myBooks = new Bookshelf();
        System.out.println("Моя книжная полка");
        myBooks.showShelf();
        boolean isExit = false;
        do {
            System.out.println("\n1. Добавить.\n2. Удалить\n3. Переместить\n4. Найти\n" +
                    "5. Количество книг и свободного места\n6. Выход.");
            System.out.print("Введите номер команды: ");
            Scanner scan = new Scanner(System.in);
            int command = 0;
            try {
                command = scan.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Для ввода используйте числа от 1 до 6.");
            }
            scan.nextLine();
            switch(command) {
                case 0:
                    break;
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
                    break;
                case 3:
                    System.out.print("Введите номер книги: ");
                    int bookPosition = scan.nextInt();
                    System.out.print("Номер позиции куда переместить: ");
                    int destination = scan.nextInt();
                    myBooks.move(bookPosition, destination);
                    break;
                case 4:
                    System.out.print("Введите название книги: ");
                    System.out.println(myBooks.find(scan.nextLine()));
                    break;
                case 5:
                    // Отказался от метода showNumOfBooks(), т.к. у меня уже есть методы для получения этой информации.
                    System.out.println("Количество книг на полке " + myBooks.getNumBooks() +
                            ". Свободных мест " + (myBooks.getShelfLength() - myBooks.getNumBooks()) + ".");
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.out.println("Такой команды нет.");
            }
            if(!isExit) {
                myBooks.showShelf();
            }
        } while(!isExit);
    }
}
