package gr.aueb.cf.blueapp.exceptions;

import java.io.Serial;

public class CustomerNotFoundException extends Exception{

    @Serial
    private static final long serialVersionUID = 1L;

    public CustomerNotFoundException(String message){
        super(message);
    }
}
