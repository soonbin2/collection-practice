package com.ohgiraffers.test;

import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return Integer.compare(o1.getCategory(), o2.getCategory());
    }
}
