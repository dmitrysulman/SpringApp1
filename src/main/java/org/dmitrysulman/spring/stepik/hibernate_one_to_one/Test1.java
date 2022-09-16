package org.dmitrysulman.spring.stepik.hibernate_one_to_one;

import org.dmitrysulman.spring.stepik.hibernate_one_to_one.entity.Detail;
import org.dmitrysulman.spring.stepik.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
//        try (Session session = factory.getCurrentSession()) {
//            Employee employee = new Employee("Dima", "Oetrov", "IT", 10000);
//            Detail detail = new Detail("Ekb", "213213", "qweqwe@asd.aa");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.persist(employee);
//            session.getTransaction().commit();
//        }

        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee.getEmpDetail());
            session.getTransaction().commit();
        }


    }
}
