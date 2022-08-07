package org.dmitrysulman.spring.stepik.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        uniLibrary.getBook("Test book");
//        Book book = context.getBean("book", Book.class);
//        uniLibrary.getBook(book);
//        uniLibrary.returnBook();
        uniLibrary.getBook();
        uniLibrary.getMagazine();
//        uniLibrary.getMagazine("Test magazine");

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
