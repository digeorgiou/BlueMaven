package gr.aueb.cf.blueapp.dao.exceptions;

import java.io.Serial;

public class MaterialDAOException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public MaterialDAOException(String message) {

        super(message);
    }
}
