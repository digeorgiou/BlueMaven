package gr.aueb.cf.blueapp.model;

public class ProductMaterial {
    private Double quantityUsed;
    private Integer productId; // Many-to-one relationship with Product
    private Integer materialId; // Many-to-one relationship with Material

    // Constructors

    public ProductMaterial() {
    }

    public ProductMaterial(Double quantityUsed, Integer productId, Integer materialId) {
        this.quantityUsed = quantityUsed;
        this.productId = productId;
        this.materialId = materialId;
    }

    // Getters and setters

    public Double getQuantityUsed() {
        return quantityUsed;
    }

    public void setQuantityUsed(Double quantityUsed) {
        this.quantityUsed = quantityUsed;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }
}
