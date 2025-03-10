package gr.aueb.cf.blueapp.dto.customer;

public class CustomerUpdateDTO extends CustomerBaseDTO{
    private Integer customerId;

    public CustomerUpdateDTO() {
    }

    public CustomerUpdateDTO(String firstname, String lastname, String phoneNumber,
                             String address, String email, String DOY,
                             String VAT, Integer customerId) {
        super(firstname, lastname, phoneNumber, address, email, DOY, VAT);
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
