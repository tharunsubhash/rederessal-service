package com.tharun.redressalservice.repository;

import com.tharun.redressalservice.models.repositorymodels.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByName(int userId);
}
