package com.tharun.redressalservice.repository;

import com.tharun.redressalservice.models.repositorymodels.Complaint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintRegistry extends CrudRepository<Complaint, Integer> {
}
