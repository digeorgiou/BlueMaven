package gr.aueb.cf.blueapp.dao.exceptions;

import java.io.Serial;

public class ProductDAOException extends Exception{

    @Serial
    private static final long serialVersionUID = 1L;

    public ProductDAOException(String message){
        super(message);
    }
}
