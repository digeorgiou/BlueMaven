package gr.aueb.cf.blueapp.model;

import java.util.Objects;

public class PurchaseItem {
    private Long purchaseItemId;
    private Double quantity;
    private Double pricePerUnit;
    private Long purchaseId; // Many-to-one relationship with Purchase
    private Integer materialId; // Many-to-one relationship with Material

    // Constructors

    public PurchaseItem() {
    }

    public PurchaseItem(Long purchaseItemId, Double quantity, Double pricePerUnit, Long purchaseId, Integer materialId) {
        this.purchaseItemId = purchaseItemId;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.purchaseId = purchaseId;
        this.materialId = materialId;
    }

    // Getters and setters

    public Long getPurchaseItemId() {
        return purchaseItemId;
    }

    public void setPurchaseItemId(Long purchaseItemId) {
        this.purchaseItemId = purchaseItemId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    @Override
    public String toString() {
        return "{" +
                "Κωδικός προϊόντος: " + getMaterialId() +
                ", Ποσότητα: " + getQuantity() +
                ", Τιμή ανά τμχ: "  + getPricePerUnit()+
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the same instance
        if (!(obj instanceof PurchaseItem that)) return false; // Check if null
        // or different class
        // Compare fields
        return Objects.equals(purchaseItemId, that.purchaseItemId) &&
                Double.compare(that.quantity, quantity) == 0 &&
                Double.compare(that.pricePerUnit, pricePerUnit) == 0 &&
                Objects.equals(purchaseId, that.getPurchaseId()) &&
                Objects.equals(materialId, that.getMaterialId());

    }


    @Override
    public int hashCode() {
        return Objects.hash(getPurchaseItemId(),getPurchaseId(),
                getMaterialId(),getQuantity(),getPricePerUnit());
    }
}
