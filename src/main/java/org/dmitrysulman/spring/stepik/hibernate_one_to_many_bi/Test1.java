package org.dmitrysulman.spring.stepik.hibernate_one_to_many_bi;

import org.dmitrysulman.spring.stepik.hibernate_one_to_many_bi.entity.Department;
import org.dmitrysulman.spring.stepik.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (Session session = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()
                .getCurrentSession()) {

//            Department department = new Department("IT", 300, 1200);
//            Employee employee1 = new Employee("Dima", "Sulman", 800);
//            Employee employee2 = new Employee("Vasya", "Pupkin", 1000);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);

            session.beginTransaction();
            Department department = session.get(Department.class, 1);
            System.out.println(department);
            System.out.println(department.getEmps());
//            session.persist(department);
            session.getTransaction().commit();
        }


    }
}
