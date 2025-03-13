package gr.aueb.cf.blueapp.dao.exceptions;

import java.io.Serial;

public class ProviderDAOException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public ProviderDAOException(String message) {

      super(message);
    }
}
