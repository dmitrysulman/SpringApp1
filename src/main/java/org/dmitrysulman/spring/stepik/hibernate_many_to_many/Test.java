package org.dmitrysulman.spring.stepik.hibernate_many_to_many;

import org.dmitrysulman.spring.stepik.hibernate_many_to_many.entity.Child;
import org.dmitrysulman.spring.stepik.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (Session session = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory()
                .getCurrentSession()) {

//            Section section1 = new Section("Football");
//            Child child1 = new Child("Dima", 37);
//            Child child2 = new Child("Sveta", 38);
//            Child child3 = new Child("Vlada", 7);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);

//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Math");
//            Section section3 = new Section("Chess");
//            Child child1 = new Child("Petya", 10);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);

            session.beginTransaction();
//            session.persist(section1);
//            session.persist(child1);
            Section section = session.get(Section.class, 1);
            System.out.println(section);
            System.out.println(section.getChildren());
            session.getTransaction().commit();
        }
    }
}
