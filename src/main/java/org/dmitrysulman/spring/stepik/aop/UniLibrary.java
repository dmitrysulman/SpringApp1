package org.dmitrysulman.spring.stepik.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook(String bookName) {
        System.out.println("Get book from uni library: " + bookName);
        System.out.println("-------------------------------------------------");
    }

    public void getBook(Book book) {
        System.out.println("Get book from uni library: " + book.getName());
        System.out.println("-------------------------------------------------");
    }

//    @Override
    public void getBook() {
        System.out.println("Get book from uni library.");
        System.out.println("-------------------------------------------------");
    }

    protected void returnBook() {
        System.out.println("Return book to uni library.");
//        return "OK";
        System.out.println("-------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Get magazine from uni library.");
        System.out.println("-------------------------------------------------");
    }

    public void getMagazine(String magazine) {
        System.out.println("Get magazine from uni library. " + magazine);
        System.out.println("-------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Return magazine to uni library.");
        System.out.println("-------------------------------------------------");
    }

    public void addBook() {
        System.out.println("Add book to uni library.");
        System.out.println("-------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Add book to uni library.");
        System.out.println("-------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Add magazine to uni library.");
    }

    public StringBuilder testMethod() {
        if (true) {
            throw new RuntimeException();
        }
        return new StringBuilder("Test String");
    }
}
