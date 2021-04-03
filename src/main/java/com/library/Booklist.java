package com.library;

import java.util.ArrayList;

public class Booklist {
    ArrayList<String> books = new ArrayList<>() {
        {
            add("book1");
            add("book2");
            add("book3");
            add("book4");
            System.out.println("Arraylist:" + books);

        }
    };
}