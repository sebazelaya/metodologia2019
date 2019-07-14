package com.codenotfound.model.factory;

import com.codenotfound.model.dao.AcademicsDao;
import com.codenotfound.model.dao.StudentDao;


public abstract class UniversityDaoFactory extends DAOFactory{
	
    public abstract AcademicsDao getAcademicsDao();
    public abstract StudentDao getStudentDao();
    
}
