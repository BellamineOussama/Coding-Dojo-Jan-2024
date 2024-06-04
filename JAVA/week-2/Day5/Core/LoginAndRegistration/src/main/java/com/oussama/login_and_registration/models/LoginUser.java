package com.oussama.login_and_registration.models;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class LoginUser {

    @NotEmpty(message="Email is required!")
    @Email(message="Please enter a valid email!")
    private String email;

    @NotEmpty(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String password;

    public LoginUser() {}

    public LoginUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // -------------------------- GETTERS AND SETTERS ------------------------

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
}
