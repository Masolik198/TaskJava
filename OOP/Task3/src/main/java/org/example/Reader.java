package org.example;

/*
Методы takeBook(), returnBook().
 */

public class Reader {
String fio;
String ticket;
String faculty;
String birthday;
String phoneNumber;



    public Reader(String fio, String ticket, String faculty, String birthday, String phoneNumber) {
        this.fio = fio;
        this.ticket = ticket;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }
    public int takeBook(int book) {
        return book;
    }

    public int returnBook() {
         int returnBook1 = takeBook(30) - userBook(10);
        return returnBook1;
    }


    private int userBook(int book) {
        return book;
    }
}
