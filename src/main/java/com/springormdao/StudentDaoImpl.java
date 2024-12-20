package com.springormdao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.Student;

public class StudentDaoImpl implements StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

     @Transactional
	public int saveStudent(Student student) {
		
		int i=(int) hibernateTemplate.save(student);
		
		
		return i;
	}

	@Override
	public Student getStudent(int st_id) {
	Student st = hibernateTemplate.get(Student.class, st_id);
		return st;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> list=hibernateTemplate.loadAll(Student.class);
		return list;
	}

	@Transactional
	public int updateStudent(Student student) {
		
	  hibernateTemplate.update(student);
	       
		return 0;

		
	}

    @Transactional
	public void deletStudent(int st_id) {
		Student st = hibernateTemplate.get(Student.class, st_id);
		
		hibernateTemplate.delete(st);
		
	}

}
