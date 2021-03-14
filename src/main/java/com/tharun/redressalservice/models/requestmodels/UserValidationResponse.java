package com.tharun.redressalservice.models.requestmodels;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class UserValidationResponse {
    public int userId;
    public String userName;
    public String userRole;
}
