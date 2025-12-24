package com.MakeMyTrip.MakeMyTrip.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.MakeMyTrip.MakeMyTrip.models.Users;
import com.MakeMyTrip.MakeMyTrip.repositories.UserRepo;
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Users login(String email, String password) {
        Users user = userRepo.findByEmail(email);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return user;
        }
        return null;
    }
    public Users signup(Users newUser) {
        Users existingUser = userRepo.findByEmail(newUser.getEmail());
        if (existingUser != null) {
            return null; // User already exists
        }
        // Encode the password before saving
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        if (newUser.getRole()==null) {
            newUser.setRole("USER"); // Default role
        }
        return userRepo.save(newUser);
    }

}
