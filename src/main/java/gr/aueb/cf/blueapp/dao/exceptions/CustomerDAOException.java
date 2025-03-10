package gr.aueb.cf.blueapp.dao.exceptions;

import java.io.Serial;

public class CustomerDAOException extends Exception{

    @Serial
    private static final long serialVersionUID = 1L;

    public CustomerDAOException(String message){
        super(message);
    }
}
