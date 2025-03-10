package gr.aueb.cf.blueapp.model;

public class ProviderMaterial {

    private String materialId; // Many-to-one relationship with Material
    private Provider providerId; // Many-to-one relationship with Provider

    // Constructors

    public ProviderMaterial() {
    }

    public ProviderMaterial(String materialId, Provider providerId) {
        this.materialId = materialId;
        this.providerId = providerId;
    }

    // Getters and setters

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public Provider getProviderId() {
        return providerId;
    }

    public void setProviderId(Provider providerId) {
        this.providerId = providerId;
    }
}
