package com.ems.in;

import java.util.Arrays;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ems.in.module.Courses;
import com.ems.in.module.Student;

public class ManyToMany {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsdb");
		EntityManager emaneger = factory.createEntityManager();
		Scanner sc= new Scanner(System.in);
		emaneger.getTransaction().begin();
		
		System.out.println("Enter name of student first");
		Student s1= new Student();
		s1.setSname(sc.nextLine());
		emaneger.persist(s1);
		
		
		System.out.println("Enter name of student first");
		Student s2= new Student();
		s2.setSname(sc.nextLine());
		emaneger.persist(s2);
		
		Courses c1= new Courses();
		System.out.println("Enter name of course");
		c1.setCname(sc.nextLine());
		emaneger.persist(c1);
		
		Courses c2= new Courses();
		System.out.println("enter name of course");
		c2.setCname(sc.nextLine());
		emaneger.persist(c2);
		
		s1.setCourses(Arrays.asList(c1,c2));
		s2.setCourses(Arrays.asList(c1,c2));
		
		emaneger.getTransaction().commit();
		
		emaneger.clear();
		factory.close();

	}

}
