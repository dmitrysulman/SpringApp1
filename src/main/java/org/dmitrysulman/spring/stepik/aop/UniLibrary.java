package org.dmitrysulman.spring.stepik.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook(String bookName) {
        System.out.println("Get book from uni library: " + bookName);
    }

    public void getBook(Book book) {
        System.out.println("Get book from uni library: " + book.getName());
    }

//    @Override
    public void getBook() {
        System.out.println("Get book from uni library.");
    }

    protected String returnBook() {
        System.out.println("Return book to uni library.");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("Get magazine from uni library.");
    }

    public void getMagazine(String magazine) {
        System.out.println("Get magazine from uni library. " + magazine);
    }
}
