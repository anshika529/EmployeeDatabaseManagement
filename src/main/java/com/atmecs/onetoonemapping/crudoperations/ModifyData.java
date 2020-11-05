package com.atmecs.onetoonemapping.crudoperations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionException;

import com.atmecs.employeedatabase.entity.Employee;
import com.atmecs.employeedatabase.util.HibernateUtil;



public class ModifyData {
	public void updateData() {
		Session session = HibernateUtil.currentSession();
		Scanner sc = new Scanner(System.in);
		try {
			session.beginTransaction();
			System.out.println("Enter id to modify record:");
			Employee emp = (Employee) session.get(Employee.class, sc.nextInt());

			if (emp != null) {
				System.out.println("Enter the new email to update");
				emp.setEmail(sc.next());
				session.saveOrUpdate(emp);

				session.getTransaction().commit();
				System.out.println("Record updated successfully..!!");
			} else {
				System.out.println("Record not found for given id, please enter a correct id");
			}
		} catch (SessionException e) {
			System.out.println(e);
		} finally {
			HibernateUtil.closeSession();
		}

	}
}
