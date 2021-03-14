package com.tharun.redressalservice.services;

import com.tharun.redressalservice.models.repositorymodels.Complaint;
import com.tharun.redressalservice.models.repositorymodels.User;
import com.tharun.redressalservice.repository.ComplaintRegistry;
import com.tharun.redressalservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AgentService {

    @Autowired
    public ComplaintRegistry complaintRegistry;

    @Autowired
    public UserRepository userRepository;

    public void registerAgent(User user) {
        user.userRole = "AGENT";
        this.userRepository.save(user);
    }

    public void updateFixByComplaintId(String fix, int complaintId) {
        Optional<Complaint> complaint = this.complaintRegistry.findById(complaintId);
        Complaint[] newComplaint = {new Complaint()};
        complaint.ifPresent(comp -> newComplaint[0] = comp);
        newComplaint[0].fix.concat(fix);
        this.complaintRegistry.save(newComplaint[0]);
    }

    public void assignComplaint(int complaintId, int userId) {
        Optional<Complaint> complaint = this.complaintRegistry.findById(complaintId);
        Complaint[] newComplaint = {new Complaint()};
        complaint.ifPresent(comp -> newComplaint[0] = comp);
        newComplaint[0].status = "ASSIGNED";
        newComplaint[0].userId = userId;

        this.complaintRegistry.save((newComplaint[0]));
    }
}
