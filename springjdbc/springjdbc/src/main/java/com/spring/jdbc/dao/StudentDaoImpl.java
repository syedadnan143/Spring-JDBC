package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl  implements StudentDao{
     
	private  JdbcTemplate jdbcTemplate;
   
	public int insert(Student student) {
		String query = "insert into student(ID,name,city) values (?,?,?)";
	    int r =	this.jdbcTemplate.update(query, student.getID(), student.getName(),student.getCity());
		return r;
	}
	
	public int change(Student student) {
		// updateing query
		String query = "update student set name =?, city=? where id =?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(),student.getID());
		return r;
	}
	@Override
	public int delete (int StudentId) {
		String querty ="delete from student where id=?";
		int r = this.jdbcTemplate.update(querty, StudentId);
		return r;
		
	}
	
	@Override
	public Student getstudent(int studentId) {
		// row mapper
		String query ="select * from student where id=?";
		RowMapper<Student>rowmapper= new RowMapperImpl();
		 Student student =this.jdbcTemplate.queryForObject(query, rowmapper, studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		// multiple Students
		String query = "select * from student";
	     List<Student>students =	this.jdbcTemplate.query(query,new RowMapperImpl());
		
		return students;
	}

	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}




}
