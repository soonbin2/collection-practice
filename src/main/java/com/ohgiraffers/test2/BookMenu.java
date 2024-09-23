package com.ohgiraffers.test2;

import java.util.Scanner;

public class BookMenu {
    //    필드: title (String), author (String), price (double)
    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void menu() {
        while (true) {
            System.out.println("----------도서 프로그램 목록------------");
            System.out.println("1. 도서 추가 ");
            System.out.println("2. 도서 가격 합계 ");
            System.out.println("3. 선택한 도서 출력 ");
            System.out.println("4. 도서 출력하기");
            System.out.println("5. 종료하기");

            System.out.print("메뉴를 선택하세요 : ");
            int choice;
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    bm.addBook();
                    break;
                case 2:
                    double total = bm.calculateTotalPrice();
                    System.out.println("도서의 가격 합계 : " + total);
                    break;
                case 3:
                    String searchTitle= sc.nextLine();
                    int index = bm.searchByAuthor(searchTitle);
                    if (index == -1) {
                        System.out.println("조회한 도서가 존재하지 않음.");
                    } else {
                        bm.printBook(index); // 해당 책 출력
                    }
                    break;
                case 4:
                    bm.printBookAll();
                    break;
                case 5:
                    System.out.println("종료합니다.");
                    sc.close();
                    return;


            }
        }
    }
}
