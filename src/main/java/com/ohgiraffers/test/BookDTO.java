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
        String categoryName;
        switch (category) {
            case 1: categoryName = "인문"; break;
            case 2: categoryName = "자연과학"; break;
            case 3: categoryName = "의료"; break;
            case 4: categoryName = "기타"; break;
            default: categoryName = "미분류"; break; // In case of an unexpected value
        }
//        return String.format("도서 번호: %d, 제목: '%s', 저자: '%s', 장르: %s", bNo, title, author, categoryName);
        return ("도서번호 : " + bNo + ", " + "제목 : " +   title+", " + "저자 : " +  author+", " + "장르 : " + categoryName );
    }


}
