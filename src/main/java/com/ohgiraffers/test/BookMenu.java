package com.ohgiraffers.test;

import java.util.Scanner;

public class BookMenu {
   private Scanner sc;
   private BookManager bm;

   public BookMenu() {
      sc = new Scanner(System.in);
      bm = new BookManager();
   }

   public void menu() {
      while(true){
         System.out.println("*** 도서 관리 프로그램 ***");
         System.out.println("1. 새 도서 추가");
         System.out.println("2. 도서정보 정렬 후 출력");
         System.out.println("3. 도서 삭제");
         System.out.println("4. 도서 검색출력");
         System.out.println("5. 전체 출력");
         System.out.println("6. 끝내기");

         System.out.print("메뉴 번호 선택: ");
         int choice = sc.nextInt();
         sc.nextLine();

         switch (choice) {
            case 1:
               BookDTO book = inputBook(); // 책 정보 입력
               bm.addBook(book); // 책 추가
               break;
            case 3:

            case 4:
               String searchTitle= inputBookTitle();
               int index = bm.searchBook(searchTitle);
               if (index == -1) {
                  System.out.println("조회한 도서가 존재하지 않음.");
               } else {
                  bm.printBook(index); // 해당 책 출력
               }
               break;
            case 5:
               bm.displayAll();
               break;
            case 6:
               System.out.println("프로그램을 종료합니다.");
               sc.close();
               return; // 종료
            default:
               System.out.println("잘못된 선택입니다. 다시 시도하세요.");
         }
      }
   }


   public BookDTO inputBook(){
      System.out.print("도서 번호 : ");
      int bNo = sc.nextInt();
      sc.nextLine();
      System.out.print("도서 제목 : ");
      String title = sc.nextLine();
      System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
      int category = sc.nextInt();
      sc.nextLine();
      System.out.print("도서 저자 : ");
      String author = sc.nextLine();

      return new BookDTO(bNo,title,category,author);
   }
   public String inputBookTitle() {
      System.out.print("도서 제목 : ");
      return sc.nextLine();

   }

}
