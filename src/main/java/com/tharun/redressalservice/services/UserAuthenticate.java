package com.tharun.redressalservice.services;


import com.tharun.redressalservice.models.repositorymodels.User;
import com.tharun.redressalservice.models.requestmodels.AssignComplaintRequest;
import com.tharun.redressalservice.models.requestmodels.UserValidationResponse;
import com.tharun.redressalservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticate {
    @Autowired
    private UserRepository userRepository;

    public UserValidationResponse getUserIdAfterValidation(AssignComplaintRequest userValidationRequest) {
        User user = this.userRepository.findByName(userValidationRequest.userId);
        UserValidationResponse userValidationResponse = new UserValidationResponse();
        if(userValidationRequest.password == user.getPassword()) {
            userValidationResponse.userId = user.userId;
            userValidationResponse.userName=user.getName();
            userValidationResponse.userRole = user.userRole;
            return userValidationResponse;
        }
        return userValidationResponse;
    }
}
