package com.codenotfound.model.factory;

import com.codenotfound.model.dao.AcademicsDao;
import com.codenotfound.model.dao.AcademicsDaoImpl;
import com.codenotfound.model.dao.StudentDao;
import com.codenotfound.model.dao.StudentDaoImpl;

public class UniversityDaoFactoryImpl extends UniversityDaoFactory {
    //public static final String DATASOURCE = "jdbc/ruda_masindivDS";

    @Override
    public StudentDao getStudentDao(){
    	return new StudentDaoImpl();
    }
    @Override
    public AcademicsDao getAcademicsDao(){
    	return new AcademicsDaoImpl();
    }

}