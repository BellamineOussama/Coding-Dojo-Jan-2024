package com.oussama.dojo_and_ninjas.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="ninjas")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 3, max = 100)
    private String first_name;

    @NotEmpty
    @Size(min = 3, max = 100)
    private String last_name;


    @NotNull
    @Min(1)
    @Max(100)
    private Integer age;


    // -------------------------------- MANY TO ONE --------------------------------
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dojo_id")
    private Dojo dojo;




    // This will not allow the createdAt column to be updated after creation
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;


    // CONSTRUCTOR
    public Ninja() {
    }

    public Ninja(String first_name, String last_name, Integer age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }


    // GETTERS AND SETTERS


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotEmpty @Size(min = 3, max = 100) String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(@NotEmpty @Size(min = 3, max = 100) String first_name) {
        this.first_name = first_name;
    }

    public @NotEmpty @Size(min = 5, max = 100) String getLast_name() {
        return last_name;
    }

    public void setLast_name(@NotEmpty @Size(min = 3, max = 100) String last_name) {
        this.last_name = last_name;
    }

    public @NotNull @Min(1) @Max(100) Integer getAge() {
        return age;
    }

    public void setAge(@NotNull @Min(1) @Max(100) Integer age) {
        this.age = age;
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

    public Dojo getDojo() {
        return dojo;
    }

    public void setDojo(Dojo dojo) {
        this.dojo = dojo;
    }
}
