package com.codenotfound.model.factory;




public abstract class DAOFactory {
    public static final int STUDENT_REPOSITORY = 1;
    public static final int ACADEMICS_REPOSITORY = 2;

    public static DAOFactory getDAOFactory(int tipo) {
        switch (tipo) {
	        case STUDENT_REPOSITORY:
	            return (DAOFactory) new UniversityDaoFactoryImpl().getStudentDao();
	        case ACADEMICS_REPOSITORY:
	        	return (DAOFactory) new UniversityDaoFactoryImpl().getAcademicsDao();
	        	
	        default:
	            return null;
        }
    }

    

}
