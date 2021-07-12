package com.ems.in;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ems.in.module.Employee;


public class Insert {

	public static void main(String[] args) {
		Employee em= new Employee();
		Scanner sc= new Scanner(System.in);
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("emsdb");
		EntityManager emaneger=factory.createEntityManager();
		
		emaneger.getTransaction().begin();
		System.out.println("Enter name to insert in table");
		em.setEcity(sc.nextLine());
		
		System.out.println("Enter city");
		em.setEcity(sc.nextLine());
		
		emaneger.persist(em);
		emaneger.getTransaction().commit();
		
		emaneger.clear();
		factory.close();
	}

}
