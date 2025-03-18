package gr.aueb.cf.blueapp.dao.exceptions;

import java.io.Serial;

public class ProductMaterialDAOException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = 1L;

    public ProductMaterialDAOException(String message) {

        super(message);
    }
}
