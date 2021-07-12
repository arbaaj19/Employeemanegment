package com.ems.in;

import java.util.Arrays;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ems.in.module.Bank;
import com.ems.in.module.Customer;



public class ManyToOne {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsdb");
		EntityManager emanager = factory.createEntityManager();
		Scanner sc= new Scanner(System.in);
		
		emanager.getTransaction().begin();
	
		Bank b1=new Bank();
		b1.setBname("ICICI Bank");
		
		emanager.persist(b1);
		
		Customer c1=new Customer();
		System.out.println("enter name");
		c1.setCname(sc.nextLine());
		System.out.println("enter city");
		c1.setCcity(sc.next());
		c1.setBank(b1);
		
		Customer c2=new Customer();
		System.out.println("enter name");
		c2.setCname(sc.nextLine());
		System.out.println("enter city");
		c2.setCcity(sc.next());
		c2.setBank(b1);
		
		
		emanager.persist(c1);
		emanager.persist(c2);
		
		
		
		emanager.getTransaction().commit();

		emanager.clear();
		factory.close();

	}

}

