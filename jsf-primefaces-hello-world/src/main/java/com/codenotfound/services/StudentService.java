package com.codenotfound.services;

import java.util.List;

import javax.inject.Named;
import com.codenotfound.model.Student;
import com.codenotfound.model.factory.DAOFactory;
import com.codenotfound.model.factory.UniversityDaoFactory;


@Named
public class StudentService {
	
	private UniversityDaoFactory studentDaoFactory ;
	
	
	public StudentService() {
		this.studentDaoFactory = (UniversityDaoFactory)DAOFactory.getDAOFactory(DAOFactory.STUDENT_REPOSITORY);
	}
	

    public List<Student> getStudentList() {
        return this.studentDaoFactory.getStudentDao().findAll();
    }
    

}