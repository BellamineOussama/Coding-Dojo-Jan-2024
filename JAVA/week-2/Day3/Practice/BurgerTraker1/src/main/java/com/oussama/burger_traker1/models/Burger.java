package com.oussama.burger_traker1.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Entity
@Table(name = "burgers")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 3, max = 100, message = "Must be between 3 and 100 characters")
    private String nameOfBurger;

    @NotEmpty
    @Size(min = 5, max = 200, message = "Must be between 5 and 200 characters")
    private String restaurant;

    @NotEmpty
    @Size(min = 10, max = 200, message = "Must be between 10 and 200")
    private String notes;

    @NotNull(message = "Must not be blank")
    @Range(min = 0, max =5, message = "Must be between 0 and 5")
    private int rating;
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;


    public Burger() {
    }

    public Burger( String nameOfBurger, String restaurant, int rating, String notes) {
        this.nameOfBurger = nameOfBurger;
        this.restaurant = restaurant;
        this.rating = rating;
        this.notes = notes;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

    // GETTERS AND SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotEmpty @Size(min = 3, max = 100, message = "Must be between 3 and 100 characters") String getNameOfBurger() {
        return nameOfBurger;
    }

    public void setNameOfBurger(@NotEmpty @Size(min = 3, max = 100, message = "Must be between 3 and 100 characters") String nameOfBurger) {
        this.nameOfBurger = nameOfBurger;
    }

    public @NotEmpty @Size(min = 5, max = 200, message = "Must be between 5 and 200 characters") String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(@NotEmpty @Size(min = 5, max = 200, message = "Must be between 5 and 200 characters") String restaurant) {
        this.restaurant = restaurant;
    }

    public @NotEmpty @Size(min = 10, max = 200, message = "Must be between 10 and 200") String getNotes() {
        return notes;
    }

    public void setNotes(@NotEmpty @Size(min = 10, max = 200, message = "Must be between 10 and 200") String notes) {
        this.notes = notes;
    }

    @NotNull(message = "Must not be blank")
    @Range(min = 0, max = 5, message = "Must be between 0 and 5")
    public int getRating() {
        return rating;
    }

    public void setRating(@NotNull(message = "Must not be blank") @Range(min = 0, max = 5, message = "Must be between 0 and 5") int rating) {
        this.rating = rating;
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
