package com.tharun.redressalservice.controllers;

import com.tharun.redressalservice.models.requestmodels.AssignComplaintRequest;
import com.tharun.redressalservice.models.requestmodels.UserValidationResponse;
import com.tharun.redressalservice.services.AgentService;
import com.tharun.redressalservice.services.UserAuthenticate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tharun.redressalservice.models.repositorymodels.User;

@RestController()
@RequestMapping("/api/redressal")
public class RedressalController {

    @Autowired
    public AgentService agentService;

    @Autowired
    public UserAuthenticate userAuthenticate;

    @PostMapping("/complaints/{id}/assign")
    public void assignComplaintById(@PathVariable int complaintId, @RequestHeader AssignComplaintRequest userRequest){
        UserValidationResponse userValidationResponse = this.userAuthenticate.getUserIdAfterValidation(userRequest);
        this.agentService.assignComplaint(complaintId, userValidationResponse.userId);
    }

    @PostMapping("/agents")
    public void registerAgent(@RequestBody User user){
        this.agentService.registerAgent(user);
    }

    @PostMapping("/complaints/{id}/fix")
    public void postFixById(@RequestBody String fix, @PathVariable int id){
        this.agentService.updateFixByComplaintId(fix, id);
    }
}
