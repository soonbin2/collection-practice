package com.ohgiraffers.test2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

    ArrayList<BookDTO> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public BookManager() {
    }

    public void addBook() {
        System.out.print("도서 제목을 입력하세요 : ");
        String title = sc.nextLine();
        System.out.print("도서 저자를 입력하세요 : ");
        String author = sc.nextLine();
        System.out.print("도서 가격을 입력하세요 : ");
        double price = sc.nextDouble();
        sc.nextLine();
        books.add(new BookDTO(title, author, price));
    }

    public void printBookAll() {
        if (books.isEmpty()) {
            System.out.println("도서가 없습니다.");

        } else {
            for (BookDTO book : books) {
                System.out.println(book);
            }
        }

    }

    public void printBook(int index) {
        if (index >= 0 && index < books.size()) {
            System.out.println(books.get(index)); // index에 해당하는 객체 출력
        } else {
            System.out.println("해당 인덱스에 도서가 존재하지 않습니다.");
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (BookDTO book : books) {
            total += book.getPrice();
        }
        return total;
    }

    public int searchByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                return i; // 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
            }
        }
        return -1; //
    }
}
