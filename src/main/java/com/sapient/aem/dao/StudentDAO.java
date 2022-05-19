package com.sapient.aem.dao;

import java.sql.SQLException;

import com.sapient.aem.model.Student;

public interface StudentDAO {
	public abstract Integer addStudent(Student student)throws SQLException;

}
