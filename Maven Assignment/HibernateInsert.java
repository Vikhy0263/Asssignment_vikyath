package com.te.hibernatefirst.dml;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatefirst.Employee;

public class HibernateInsert {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEname("Vikhyath");
		employee.setAddress("Mangalore");
		employee.setPassword("VKS");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
	}

}
