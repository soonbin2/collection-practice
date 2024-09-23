package com.ohgiraffers.test;

import java.util.ArrayList;
import java.util.Collections;

public class BookManager {
    private ArrayList<BookDTO> bookList;

    public BookManager(){
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book){
        bookList.add(book); // bookList에 Book 객체 추가

    }

    public void deleteBook(int index){
        if (index >= 0 && index < bookList.size()) {
            bookList.remove(index);
        }
    }
    public int searchBook(String Title){
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(Title)) {
                return i; // 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
            }
        }
        return -1; // 도서명이 일치하는 객체가 리스트에 없으면 -1 리턴
    }
    public void printBook(int index){
        if (index >= 0 && index < bookList.size()) {
            System.out.println(bookList.get(index)); // index에 해당하는 객체 출력
        } else {
            System.out.println("해당 인덱스에 도서가 존재하지 않습니다.");
        }
    }
    public void displayAll(){
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
        } else {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        }
    }
    public ArrayList<BookDTO> sortedBookList(int select){
        ArrayList<BookDTO> sortedList = new ArrayList<>(bookList);
        if (select == 1) {
            bookList.sort( new AscCategory());
        } else if (select == 2) {
            bookList.sort( new DescCategory());
        }
        return sortedList;

    }
    public void printBookList(ArrayList<BookDTO> br){
        for (BookDTO book : br) {
            System.out.println(book);
        }
    }
}
