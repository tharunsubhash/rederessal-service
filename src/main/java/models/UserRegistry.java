package com.tharun.complaintsservice.models.repositorymodels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@NoArgsConstructor
@Entity
@Builder
@AllArgsConstructor
@Table(name = "usersregistry")
public class UserRegistry {
    @Id
    @Column(name = "UserId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public String userId;

    @Column(name = "UserName")
    public String userName;

    @Column(name = "EmailId")
    public String emailId;

    @Column(name = "PhoneNumber")
    public String phoneNumber;

    @Column(name = "Role")
    public String userRole;
}
