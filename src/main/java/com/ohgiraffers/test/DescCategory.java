package com.ohgiraffers.test;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return Integer.compare(o2.getCategory(), o1.getCategory());
    }
}
