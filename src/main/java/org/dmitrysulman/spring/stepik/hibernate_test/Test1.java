package org.dmitrysulman.spring.stepik.hibernate_test;

import org.dmitrysulman.spring.stepik.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        int id = 4;
//        try (Session session = factory.getCurrentSession()) {
//            Employee employee = new Employee("Sergey", "Ivanov", "Management", 15000);
//            session.beginTransaction();
//            session.persist(employee);
//            session.getTransaction().commit();
//            id = employee.getId();
//        }

//        try (Session session = factory.getCurrentSession()) {
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, id);
//            employee.setSurname("Kozlov");
//            employee.setSalary(9000);
//            session.getTransaction().commit();
//            System.out.println(employee);
//        }

        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Employee employee = session.get(Employee.class, id);
            session.remove(employee);
            session.getTransaction().commit();
            System.out.println(employee);
        }

        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            session.createQuery("update Employee set department='other' where name='Sergey'").executeUpdate();
            session.getTransaction().commit();
        }

        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            List<Employee> employees = session.createQuery("from Employee where name = 'Sergey'", Employee.class).getResultList();
            employees.forEach(System.out::println);
            session.getTransaction().commit();
        }
    }
}
