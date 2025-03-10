package gr.aueb.cf.blueapp.model;

import java.time.LocalDateTime;
import java.util.Objects;


public class Sale {
        private Long id;
        private LocalDateTime date;
        private PaymentMethod paymentMethod;
        private Integer customerId; // Many-to-one relationship with Customer
        private Double totalAmountSuggested;
        private Double totalAmountFinal;
        private Double discountPercentage;


    // Constructors


    public Sale() {
    }

    public Sale(Long id, LocalDateTime date, PaymentMethod paymentMethod, Integer customerId,
                Double totalAmountSuggested, Double totalAmountFinal, Double discountPercentage) {
        this.id = id;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.customerId = customerId;
        this.totalAmountSuggested = totalAmountSuggested;
        this.totalAmountFinal = totalAmountFinal;
        this.discountPercentage = discountPercentage;
    }

    // Getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Double getTotalAmountSuggested() {
        return totalAmountSuggested;
    }

    public void setTotalAmountSuggested(Double totalAmountSuggested) {
        this.totalAmountSuggested = totalAmountSuggested;
    }

    public Double getTotalAmountFinal() {
        return totalAmountFinal;
    }

    public void setTotalAmountFinal(Double totalAmountFinal) {
        this.totalAmountFinal = totalAmountFinal;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    // equals(), hashCode(), and toString()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Sale that)) return false;
        return Objects.equals(getId(), that.getId())
                && Objects.equals(getDate(),that.getDate())
                && Objects.equals(getPaymentMethod(), that.getPaymentMethod())
                && Objects.equals(getCustomerId(), that.getCustomerId())
                && Objects.equals(getDiscountPercentage(),that.getDiscountPercentage())
                && Objects.equals(getTotalAmountSuggested(),that.getTotalAmountSuggested());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),getDate(),getCustomerId(),getPaymentMethod()
        ,getTotalAmountFinal(),getDiscountPercentage(),getTotalAmountSuggested());
    }

    @Override
    public String toString() {
        return "Κωδικός Πώλησης: " + getId() + ", Ημερομηνία: " + getDate() +
                ", Συνολικό ποσό πληρωμής: " + getTotalAmountFinal();
    }

}
