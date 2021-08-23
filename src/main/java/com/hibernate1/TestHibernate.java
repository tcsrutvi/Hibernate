package com.hibernate1;

import org.hibernate.Session;


public class TestHibernate {
	public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        //Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("rutvi@mail.com");
        emp.setFirstName("Rutvi");
        emp.setLastName("Shah");
         
         
        session.save(emp);
         
        session.getTransaction().commit();
        HibernateUtil.shutdown();
	}
}

