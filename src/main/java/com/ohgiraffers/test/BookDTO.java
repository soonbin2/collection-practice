package com.ohgiraffers.test;

public class BookDTO {
    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO(int bNo, String title, int category, String author) {
        this.bNo=bNo;
        this.title=title;
        this.category=category;
        this.author=author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    @Override
    public String toString() {
//        public void category2(int category){
//            if(category == 1){
//                System.out.println("1 : 인문");
//            }else if(category == 2){
//                System.out.println("2 : 자연과학");
//            }else if(category == 3){
//                System.out.println("3 : 의료");
//            }else if(category ==4){
//                System.out.println("4 : 기타");
//            }else{
//                System.out.println("없는 도서분류코드 입니다.");
//            }
//        }

        return "BookDTO{" +
                "bNo=" + bNo +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
