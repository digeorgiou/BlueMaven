package gr.aueb.cf.blueapp.model;


import java.util.Objects;

public class SalesItem {
    private long salesItemId;
    private int quantity;
    private double recommendedPrice; // Recommended price = product.getPrice() * quantity
    private Long saleId; // Many-to-one relationship with Sale
    private Integer productId; // Many-to-one relationship with Product

    // Constructors

    public SalesItem() {
    }

    public SalesItem(long salesItemId, int quantity, double recommendedPrice,
                     Long saleId, Integer productId) {
        this.salesItemId = salesItemId;
        this.quantity = quantity;
        this.recommendedPrice = recommendedPrice;
        this.saleId = saleId;
        this.productId = productId;
    }

    // Getters and Setters


    public long getSalesItemId() {
        return salesItemId;
    }

    public void setSalesItemId(long salesItemId) {
        this.salesItemId = salesItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRecommendedPrice() {
        return recommendedPrice;
    }

    public void setRecommendedPrice(double recommendedPrice) {
        this.recommendedPrice = recommendedPrice;
    }

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "{" +
                "Κωδικός προϊόντος: " + getProductId() +
                ", Ποσότητα: " + getQuantity() +
                "Τιμή: "  + getRecommendedPrice()+
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the same instance
        if (!(obj instanceof SalesItem that)) return false;

        // Compare fields
        return  getSalesItemId() == that.getSalesItemId() &&
                getQuantity() == that.getQuantity() &&
                Double.compare(that.getRecommendedPrice(), getRecommendedPrice()) == 0 &&
                Objects.equals(getSaleId(), that.getSaleId()) &&
                Objects.equals(getProductId(), that.getProductId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSaleId(),getSalesItemId(),getProductId(),
                getQuantity(),getRecommendedPrice());
    }

}