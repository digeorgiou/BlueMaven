package gr.aueb.cf.blueapp.dto.customer;

public abstract class CustomerBaseDTO {

    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String address;
    private String email;
    private String DOY;
    private String VAT;

    public CustomerBaseDTO() {}

    public CustomerBaseDTO(String firstname, String lastname, String phoneNumber,
                           String address, String email, String DOY, String VAT) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.DOY = DOY;
        this.VAT = VAT;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDOY() {
        return DOY;
    }

    public void setDOY(String DOY) {
        this.DOY = DOY;
    }

    public String getVAT() {
        return VAT;
    }

    public void setVAT(String VAT) {
        this.VAT = VAT;
    }
}
