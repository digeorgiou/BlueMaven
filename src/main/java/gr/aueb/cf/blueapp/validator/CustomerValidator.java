package gr.aueb.cf.blueapp.validator;

import gr.aueb.cf.blueapp.dto.customer.CustomerBaseDTO;

import java.util.HashMap;
import java.util.Map;

//utility class
public class CustomerValidator<T> {

    private CustomerValidator() {}

    //ο κλασικος τροπος να υλοποιησει κανεις validator ειναι με
    //Map<String, String> το 1ο String ειναι το πεδιο, το 2ο ειναι η
    // περιγραφη του λαθους
    public static <T extends CustomerBaseDTO > Map<String, String> validate(T dto) {
        Map<String, String> errors = new HashMap<>();

        //validations for length
        if (dto.getFirstname().length() < 2 || dto.getFirstname().length() > 32) {
            errors.put("firstname", "Firstname must be between 2 and 32 " +
                    "characters.");
        }
        if (dto.getLastname().length() < 2 || dto.getLastname().length() > 32) {
            errors.put("lastname", "Lastname must be between 2 and 32 " +
                    "characters.");
        }
        //validations for spaces
        if (dto.getFirstname().matches("^.*\\s+.*$")) {
            errors.put("firstname", "Firstname must not include spaces");
        }

        if (dto.getLastname().matches("^.*\\s+.*$")) {
            errors.put("lastname", "Lastname must not include spaces");
        }

        return errors;
    }
}
