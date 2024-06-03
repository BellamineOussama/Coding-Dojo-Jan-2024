package com.oussama.save_travels.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "travels")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100, message = "Must  be between 3 and 100")
    private String expense;

    @NotBlank
    @Size(min = 3, max = 100, message = "Must be between 3 and 100")
    private String vendor;

    @NotNull
    @Min(1)
    private double amount;

    @NotBlank
    @Size(min = 10, max = 300, message = "Must be between 10 and 300")
    private String description;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

    public Travel() {
    }

    public Travel(String expense, String vendor, double amount, String description) {
        this.expense = expense;
        this.vendor = vendor;
        this.amount = amount;
        this.description = description;
    }

    // GETTERS AND SETTERS


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank @Size(min = 3, max = 100, message = "Must  be between 3 and 100") String getExpense() {
        return expense;
    }

    public void setExpense(@NotBlank @Size(min = 3, max = 100, message = "Must  be between 3 and 100") String expense) {
        this.expense = expense;
    }

    public @NotBlank @Size(min = 3, max = 100, message = "Must be between 3 and 100") String getVendor() {
        return vendor;
    }

    public void setVendor(@NotBlank @Size(min = 3, max = 100, message = "Must be between 3 and 100") String vendor) {
        this.vendor = vendor;
    }

    @NotNull
    @Min(1)
    public double getAmount() {
        return amount;
    }

    public void setAmount(@NotNull @Min(1) double amount) {
        this.amount = amount;
    }

    public @NotBlank @Size(min = 10, max = 300, message = "Must be between 10 and 300") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank @Size(min = 10, max = 300, message = "Must be between 10 and 300") String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}