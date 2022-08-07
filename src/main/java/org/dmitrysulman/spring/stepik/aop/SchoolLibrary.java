package org.dmitrysulman.spring.stepik.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
//    @Override
    public void getBook() {
        System.out.println("Get book from school library.");
    }
}
