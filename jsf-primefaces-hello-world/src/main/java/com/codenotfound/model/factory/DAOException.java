package com.codenotfound.model.factory;


/**
 * Clase que permite personalizar excepciones provenientes de la capa de datos
 * tales como SQLException, etc.
 * 
 * @author Eduardo Godoy
 * @version 1.0, 03/02/2013
 * 
 */
public class DAOException extends Exception {

    /**
	 * 
	 */
    private static final long serialVersionUID = 3954792017153054275L;

    /**
     * Contructor que recibe una cadena de string que representa un mensaje de
     * error personalizado por el desarrollador.
     * 
     * @param message
     *            Nombre de proyecto EAR
     * @param cause
     *            cause
     *            
     */
    public DAOException(String message, Throwable cause) {

        super(message, cause);
    }

    /**
     * Metodo encargado de retornar el valor del EJB desde su interfaz remota.
     * 
     * @param message String Nombre de proyecto EAR
     * @param cause String Nombre de Session bean que implementa la interfaz Remota
     */
    public DAOException(String message, Exception cause) {
        super(message, cause);

    }

}
