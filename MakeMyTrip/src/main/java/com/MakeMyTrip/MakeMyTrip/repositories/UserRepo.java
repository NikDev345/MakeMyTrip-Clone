package com.MakeMyTrip.MakeMyTrip.repositories;
import com.MakeMyTrip.MakeMyTrip.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UserRepo extends MongoRepository<Users, String> {
    Users findByEmail(String email);
}
