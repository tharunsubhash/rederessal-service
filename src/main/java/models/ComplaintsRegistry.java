package models;

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
@Table(name = "complaintsregistry")
public class ComplaintsRegistry {
    @Id
    @Column(name = "ComplaintId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int complaintId;

    @Id
    @ManyToOne
    @Column(name = "UserId")
    public int userId;

    @Column(name = "DateCreated")
    public int dateCreated;

    @Column(name = "DeviceModel")
    public String deviceModel;

    @Column(name = "Manufacturer")
    public String manufacturer;

    @Column(name = "ProblemSummary")
    public String problemSummary;

    @Column(name = "Description")
    public String description;

    @Column(name= "Fix")
    public String fix;

    @Column(name="Status")
    public String status;

    @Column(name="AssignedTo")
    public int agentId;
}
