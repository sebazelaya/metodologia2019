package com.codenotfound.services;

import java.util.List;

import javax.inject.Named;

import com.codenotfound.model.Academics;
import com.codenotfound.model.factory.DAOFactory;
import com.codenotfound.model.factory.UniversityDaoFactory;


@Named
public class AcademicsService {
	
	private UniversityDaoFactory academicsDaoFactory ;
	
	
	public AcademicsService() {
		this.academicsDaoFactory = (UniversityDaoFactory)DAOFactory.getDAOFactory(DAOFactory.ACADEMICS_REPOSITORY);
	}
	

    public List<Academics> getAcademicsList() {
        return this.academicsDaoFactory.getAcademicsDao().findAll();
    }
    

}