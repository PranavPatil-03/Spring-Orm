package com.springormdao;

import java.util.List;

import com.springorm.Student;

public interface StudentDao {
	
	public int saveStudent(Student student);
	
	public Student getStudent(int st_id);
	
	public List<Student> getAllStudents();
	
	public int updateStudent(Student student);
	
	public void deletStudent(int st_id);

}
