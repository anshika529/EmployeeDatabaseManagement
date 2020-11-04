package com.atmecs.onetoonemapping.crudoperations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionException;

import com.atmecs.employeedatabase.entity.Employee;
import com.atmecs.employeedatabase.entity.EmployeeDetails;
import com.atmecs.employeedatabase.util.HibernateUtil;

public class AddData {
	public void adddata() {
		Session session = HibernateUtil.currentSession();
		Scanner sc = new Scanner(System.in);

		try {
			session.beginTransaction();
			System.out.println("Enter the number of records you want to add");
			int number = sc.nextInt();
			for (int i = 1; i <= number; i++) {
				Employee emp=new Employee();
				System.out.println("Enter Employee Details");
				System.out.println("Enter id:");
				emp.setId(sc.nextInt());
				System.out.println("Enter User Name:");
				emp.setName(sc.next());
				
				EmployeeDetails empdetail=new EmployeeDetails();
				System.out.println("Email :");
				empdetail.setExperience(sc.next());
				emp.setEmpdetails(empdetail);
				session.persist(emp);
				session.getTransaction().commit();
				System.out.println("Record successfully added");
			}
		} catch (SessionException e) {
			System.out.println(e);
		} finally {
			HibernateUtil.closeSession();
		}
	}
}
