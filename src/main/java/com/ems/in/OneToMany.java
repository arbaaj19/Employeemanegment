package com.ems.in;

import java.util.Arrays;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ems.in.module.Person;
import com.ems.in.module.Vehical;

public class OneToMany {

	public static void main(String[] args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("emsdb");
		EntityManager emaneger= factory.createEntityManager();
		Scanner sc= new Scanner(System.in);
		
		emaneger.getTransaction().begin();
		Person p= new Person();
		Vehical v1= new Vehical();
		Vehical v2= new Vehical();
		
		System.out.println("Enter name of person");
		p.setPname(sc.nextLine());
		System.out.println("Enter city of person");
		p.setPcity(sc.next());
		
		System.out.println("enter vehical name");
		v1.setVname(sc.next());
		
		System.out.println("enter vehical name");
		v2.setVname(sc.next());

		p.setVehicles(Arrays.asList(v1,v2));
		emaneger.persist(p);
		emaneger.getTransaction().commit();
		
		emaneger.clear();
		factory.close();
		
	}

}
