package gr.aueb.cf.blueapp.dto.customer;

public class CustomerInsertDTO extends CustomerBaseDTO{

    public CustomerInsertDTO() {

    }

    public CustomerInsertDTO(String firstname, String lastname, String phoneNumber,
                             String address, String email, String DOY, String VAT) {
        super(firstname, lastname, phoneNumber, address, email, DOY, VAT);
    }
}
