package com.oussama.book_club.services;

import com.oussama.book_club.models.LoginUser;
import com.oussama.book_club.models.User;
import com.oussama.book_club.repositories.UserRepo;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    // ------------------------------- REGISTER USER -------------------------------
    // register user and hash their password
    public User register(User newUser, BindingResult result) {
        // Check if Email already exists in the database
        Optional<User> potentialUser =  userRepo.findByEmail(newUser.getEmail());
        //if email is already in the database
        if (potentialUser.isPresent()){
            result.rejectValue("email", "registerErrors", "This email is already in use");
        }
        // Check if password matches
        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("confirmPassword", "registerErrors", "Passwords do not match");
        }
        //if there are errors
        if (result.hasErrors()) {
            return null;
        } else {
            // hash the password
            String hashed = BCrypt.hashpw(newUser.getPassword(),BCrypt.gensalt());
            //  Intercept the user object to store the hashed password instead of plain text
            newUser.setPassword(hashed);
            // Save User to the Data Base
            return userRepo.save(newUser);
        }
    }



    // -------------------------------- LOGIN USER ---------------------------------------
    public User login(LoginUser newLogin, BindingResult result){
        //check if email is in the database
        Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
        //if user is not present in the database
        if(potentialUser.isEmpty()){
            result.rejectValue("email", "loginErrors", "Invalid credential!");

        }else{
            User user = potentialUser.get();
            //check if password matches
            if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())){
                //if password does not match
                result.rejectValue("password", "loginErrors", "Invalid credential!");
            }
            //if there are errors
            if(result.hasErrors()){
                return null;
            }else{
                //if there are no errors
                return user;
            }
        }
        return null;
    }





    // ----------------------------- READ ALL --------------------------------
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // ----------------------------- READ ONE --------------------------------
    public User findUserById(Long id){
        Optional<User> optionalUser = userRepo.findById(id);
        return optionalUser.orElse(null);
    }

}

