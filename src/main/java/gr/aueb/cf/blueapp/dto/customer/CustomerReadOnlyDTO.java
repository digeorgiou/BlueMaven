package gr.aueb.cf.blueapp.dto.customer;

import java.time.LocalDateTime;

/**
 * Αυτό ειναι DTO που στελνουμε πισω στον client
 */

public class CustomerReadOnlyDTO extends CustomerBaseDTO{

    private Integer customerId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CustomerReadOnlyDTO(){

    }

    public CustomerReadOnlyDTO(Integer customerId, String firstname, String lastname,
                               String phoneNumber, String address, String email,
                               String DOY, String VAT, LocalDateTime createdAt, LocalDateTime updatedAt) {

        super(firstname, lastname, phoneNumber, address, email, DOY, VAT);
        this.customerId = customerId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
