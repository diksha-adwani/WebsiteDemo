package com.pojos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest 
{
	private static EntityManager em;

	public static void main(String[] args) 
	{

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
		em = emf.createEntityManager();



		createStudent(222, "John", "Peter",77.5,"Pune");
		//  updateStudent(101, "Manager");

		//   createStudent(5, "Jack", " Dorsey", "Imaginea");
		//   createStudent(6, "Sam", "Fox", "Imaginea");


		//   updateStudent(5,"Manager");


/*		deleteStudent(6);*/   
		emf.close();

	}

	//create new Student
	private static void createStudent(int id, String firstName, String lastName,double marks, String dept) {
		em.getTransaction().begin();
		Student emp = new Student(id, firstName, lastName,marks,dept);
		em.persist(emp);
		em.getTransaction().commit();

	}

/*	//update existing
	private static void updateStudent(int id,String newdesg) {
		em.getTransaction().begin( );
		Student Student = em.find( Student.class, id );
		//   System.out.println("Found");
		//display record before update
		System.out.println("Student ID = " + Student.getId());
		System.out.println("Student NAME = " + Student.getfname());
		System.out.println("Student Last Name = " + Student.getlanme());
		System.out.println("Student DESIGNATION = " + Student.getdesg());


		//before update
		System.out.println( Student );
		Student.setdesg(newdesg);
		em.getTransaction( ).commit( );

		//after update
		System.out.println( Student );
		em.close();


	}


	//delete
	private static void deleteStudent(int id) {
		em.getTransaction().begin( );
		Student Student = em.find( Student.class, id );
		//display record before update
		System.out.println("Student ID = " + Student.getId());
		System.out.println("Student NAME = " + Student.getfname());
		System.out.println("Student Last Name = " + Student.getlanme());
		System.out.println("Student DESIGNATION = " + Student.getdesg());

		em.remove(Student);
		em.getTransaction().commit();
		em.close();
*/
}
