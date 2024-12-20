package com.springorm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springormdao.StudentDao;
import com.springormdao.StudentDaoImpl;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springormconfig/config.xml");

		/*
		 * HibernateTemplate tem=context.getBean("template",HibernateTemplate.class);
		 * 
		 * System.out.println(tem);
		 */

		StudentDao dao = context.getBean("stDao", StudentDao.class);

		
		 Student st=new Student();
		  
		  st.setSt_id(2);
		  
		  st.setSt_name("Saurabh");
		  
		  st.setSt_city("Mumbai");
		  
		  int i=dao.saveStudent(st);
		  
		  System.out.println("Data Addede Successfully"+ i);
		 

		// st=dao.getStudent(2);

//		List<Student> list = dao.getAllStudents();
//
//		for (Student st : list) {
//			System.out.println(st);
//		}

//		dao.deletStudent(2);
//		List<Student> list = dao.getAllStudents();
//
//		for (Student st : list) {
//			System.out.println(st);
//		}

		/*
		 * Student st=new Student();
		 * 
		 * st.setSt_id(2);
		 * 
		 * st.setSt_name("Srabhau");
		 * 
		 * st.setSt_city("Mumbai");
		 * 
		 * dao.updateStudent(st);
		 * 
		 * System.out.println("Data Updated Successfully");
		 */

	}
}
