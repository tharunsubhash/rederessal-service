package com.tharun.redressalservice.models.requestmodels;

import lombok.Data;

@Data
public class AssignComplaintRequest {
    public int userId;
    public String password;
}
