package com.oussama.login_and_registration.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Username is required!")
    @Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Username must contain only alphabetical characters")
    private String userName;

    @NotEmpty(message = "Email is required!")
    @Email(message = "Please enter a valid email!")
    private String email;

    @NotEmpty(message = "Password is required!")
    @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters")
    private String password;

    @Transient
    @NotEmpty(message = "Confirm Password is required!")
    @Size(min = 8, max = 128, message = "Confirm Password must be between 8 and 128 characters")
    private String confirm;


    public User() {
    }

    // ----------------------------- GETTERS AND SETTERS ----------------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotEmpty(message = "Username is required!") @Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters") String getUserName() {
        return userName;
    }

    public void setUserName(@NotEmpty(message = "Username is required!") @Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters") String userName) {
        this.userName = userName;
    }

    public @NotEmpty(message = "Email is required!") @Email(message = "Please enter a valid email!") String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty(message = "Email is required!") @Email(message = "Please enter a valid email!") String email) {
        this.email = email;
    }

    public @NotEmpty(message = "Password is required!") @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters") String getPassword() {
        return password;
    }

    public void setPassword(@NotEmpty(message = "Password is required!") @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters") String password) {
        this.password = password;
    }

    public @NotEmpty(message = "Confirm Password is required!") @Size(min = 8, max = 128, message = "Confirm Password must be between 8 and 128 characters") String getConfirm() {
        return confirm;
    }

    public void setConfirm(@NotEmpty(message = "Confirm Password is required!") @Size(min = 8, max = 128, message = "Confirm Password must be between 8 and 128 characters") String confirm) {
        this.confirm = confirm;
    }
}