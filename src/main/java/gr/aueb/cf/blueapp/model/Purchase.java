package gr.aueb.cf.blueapp.model;


import java.time.LocalDateTime;
import java.util.Objects;


public class Purchase {
    private long purchaseId;
    private double totalCost;
    private LocalDateTime purchaseDate;
    private Integer providerId;

    // Constructors

    public Purchase() {
    }

    public Purchase(long purchaseId, double totalCost, LocalDateTime purchaseDate, Integer providerId) {
        this.purchaseId = purchaseId;
        this.totalCost = totalCost;
        this.purchaseDate = purchaseDate;
        this.providerId = providerId;
    }

    public Purchase(Purchase purchase) {
        this.purchaseId = purchase.getPurchaseId();
        this.purchaseDate = purchase.getPurchaseDate();
        this.totalCost = purchase.getTotalCost();
        this.providerId = purchase.getProviderId();
    }

    // Getters and setters

    public long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(long purchaseId) {
        this.purchaseId = purchaseId;
    }


    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDateTime getPurchaseDate() {

        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    @Override
    public String toString() {
        return "Κωδικός Αγοράς: " + getPurchaseId() + "Ημερομηνία: " + getPurchaseDate() +
                ", Προμηθευτής: " + getProviderId() +
                "Συνολικό Ποσό: " + getTotalCost();
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof Purchase that)) return false;
        return  Objects.equals(getPurchaseId(),
                that.getPurchaseId())
                && Objects.equals(getPurchaseDate(), that.getPurchaseDate())
                && Objects.equals(getTotalCost(), that.getTotalCost())
                && Objects.equals(getProviderId(), that.getProviderId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPurchaseId(),getPurchaseDate(),
                getTotalCost(), getProviderId());
    }
}
