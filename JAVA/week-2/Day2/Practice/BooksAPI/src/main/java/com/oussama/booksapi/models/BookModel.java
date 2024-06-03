package com.oussama.booksapi.models;


import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "books")
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 5, max = 200)
    private String title;

    @NotEmpty
    @Size(min = 5, max = 200)
    private String description;

    @NotEmpty
    @Size(min = 3, max = 40)
    private String language;

    @NotNull
    @Min(100)
    @Max(9999)
    private Integer numberOfPages;
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    // Empty Constructor
    public BookModel() {
    }
    // Overloading constructor
    public BookModel(String title, String description, String language, int pages) {
        this.title = title;
        this.description = description;
        this.language = language;
        this.numberOfPages = pages;
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

    public @NotNull @Size(min = 5, max = 200) String getTitle() {
        return title;
    }

    public void setTitle(@NotNull @Size(min = 5, max = 200) String title) {
        this.title = title;
    }

    public @NotNull @Size(min = 5, max = 200) String getDescription() {
        return description;
    }

    public void setDescription(@NotNull @Size(min = 5, max = 200) String description) {
        this.description = description;
    }

    public @NotNull @Size(min = 3, max = 40) String getLanguage() {
        return language;
    }

    public void setLanguage(@NotNull @Size(min = 3, max = 40) String language) {
        this.language = language;
    }

    public @NotNull @Min(100) Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(@NotNull @Min(100) Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
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
