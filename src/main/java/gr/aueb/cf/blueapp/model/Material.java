package gr.aueb.cf.blueapp.model;

import java.util.Objects;

public class Material {
    private Integer materialId;
    private String name;
    private Integer quantityInStock;
    private Double unitPrice;

    // Constructors

    public Material() {
    }

    public Material(Integer materialId, String name, Integer quantityInStock, Double unitPrice) {
        this.materialId = materialId;
        this.name = name;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public Material(Material material){
        this.materialId = material.getMaterialId();
        this.name = material.getName();
        this.quantityInStock = material.getQuantityInStock();
        this.unitPrice = material.getUnitPrice();

    }

    // Getters and setters

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getQuantityInStock() {

        return quantityInStock;
    }

    public void setQuantity(Integer quantity) {
        this.quantityInStock = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPricePerGram) {
        this.unitPrice = unitPricePerGram;
    }


    @Override
    public String toString() {
        return "Κωδικός Υλικού: " + getMaterialId() +", Όνομα: " + getName()
                + "\nΑπόθεμα: " + getQuantityInStock() + ", Τιμή ανα τμχ: " +
                + getUnitPrice() + " ευρώ" ;
    }

    @Override
    public boolean equals(Object obj) {
            if(this == obj) return true;

            if (!(obj instanceof Material that)) return false;
            return Objects.equals(getMaterialId(), that.getMaterialId())
                    && Objects.equals(getName(), that.getName())
                    && Objects.equals(getQuantityInStock(), that.getQuantityInStock())
                    && Objects.equals(getUnitPrice(), that.getUnitPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaterialId(),getName(),
                getQuantityInStock(),getUnitPrice());
    }
}
