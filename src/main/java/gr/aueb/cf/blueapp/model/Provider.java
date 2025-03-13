package gr.aueb.cf.blueapp.model;


import java.time.LocalDateTime;
import java.util.Objects;

public class Provider {
    private Integer providerId;
    private String providerName;
    private String VAT;
    private String DOY;
    private String address;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    // Constructors

    public Provider() {
    }

    public Provider(Integer providerId, String providerName, String VAT, String DOY,
                    String address, String phoneNumber, LocalDateTime createdAt,
                    LocalDateTime updatedAt) {
        this.providerId = providerId;
        this.providerName = providerName;
        this.VAT = VAT;
        this.DOY = DOY;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Provider (Provider provider){
        this.providerId = provider.getProviderId();
        this.providerName = provider.getProviderName();
        this.VAT = provider.getVAT();
        this.DOY = provider.getDOY();
        this.address = provider.getAddress();
        this.phoneNumber = provider.getPhoneNumber();
    }

    // Getters and setters

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getVAT() {
        return VAT;
    }

    public void setVAT(String VAT) {
        this.VAT = VAT;
    }

    public String getDOY() {
        return DOY;
    }

    public void setDOY(String DOY) {
        this.DOY = DOY;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    @Override
    public String toString() {
        return "Κωδικός Προμηθευτή: " + getProviderId() + ", Προμηθευτής: " + getProviderName()
                +", Τηλέφωνο: " + getPhoneNumber() + "\n"
                + ", ΑΦΜ: " + getVAT();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof Provider that)) return false;
        return Objects.equals(getAddress(), that.getAddress())
                && Objects.equals(getProviderId(), that.getProviderId())
                && Objects.equals(getVAT(), that.getVAT())
                && Objects.equals(getProviderName(), that.getProviderName())
                && Objects.equals(getPhoneNumber(), that.getPhoneNumber())
                && Objects.equals(getDOY(), that.getDOY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress(),getDOY(),getProviderId(),
                getProviderName(),getVAT(),
                getPhoneNumber());
    }
}
