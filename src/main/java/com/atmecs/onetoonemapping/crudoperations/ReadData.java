package com.atmecs.onetoonemapping.crudoperations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionException;

import com.atmecs.employeedatabase.entity.Employee;
import com.atmecs.employeedatabase.util.HibernateUtil;


public class ReadData {
	public void readData() {
		Session session = HibernateUtil.currentSession();
		Scanner sc = new Scanner(System.in);
		try {
			session.beginTransaction();
			System.out.println("Enter id to read the data:");
			Employee emp = (Employee) session.get(Employee.class, sc.nextInt());
			System.out.println("Id is:" + emp.getEmp_id());
			System.out.println("Employee Name : " + emp.getEmployee_name());
			System.out.println("Email is:" + emp.getEmail());
			System.out.println("Record Displayed successfully");
		} catch (SessionException e) {
			System.out.println(e);
		} finally {
			HibernateUtil.closeSession();
		}
	}
}
