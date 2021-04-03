package com.library;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public  class Librarian {
    static String Librarian;

    public class addBooks {
        void addNewBook() {
            ArrayList<String> list = new ArrayList<>();
            list.add("The Mocking Bird");
            list.add("Hard Times");
            list.add("Intro Java for Dummies");
            System.out.println(list);

        }
    }

    public class viewBooks extends Librarian {
        void viewBooks() {
            String[] list = new String[3];
            for (String Books : list)
                System.out.println("the list of active librarians is " + Books);
        }
    }

    public class issueBooks extends addBooks {
        void issueBooks() {
            String list = new Booklist() {
            if(list.contains("The Mocking Bird"))

                {

                    System.out.println("issue The Mocking Bird");
                }
            };

            if (list.contains("Hard Times")) {
                System.out.println("issue Hard Times");
            }
            if (list.contains("Intro Java for Dummies")) {
                System.out.println("issue Intro Java for Dummies");

            } else
                System.out.println("element not present in library; please choose a book that is available");

        }
    }

        public void seeIssuedBooks() {
            String issuedBooks = new Booklist() {
                ArrayList<String> issuedBooks = new ArrayList<>() {
                    {
                        add("Hard Times");
                        add("The Mocking Bird");
                        add("Intro Java for Dummies");
                        System.out.println("issued books as of today are " + issuedBooks);
                    }

                };

            }

        }
        public void returnBooks(){
        String returnBooks = new Booklist() {
            ArrayList <String> returnedBooks = new ArrayList<>() {
                {
                    add("Hard Times");
                    add("The Mocking Bird");
                    add("Intro Java for Dummies");
                    System.out.println(" The list of returned books contains " + returnedBooks);
                };

            };
        }
        };
        public void logOut(){

            System.out.println(" you have successfully logged out");
        }
};

