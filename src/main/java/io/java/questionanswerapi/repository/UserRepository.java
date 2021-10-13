package io.java.questionanswerapi.repository;

import org.springframework.data.repository.CrudRepository;

import io.java.questionanswerapi.dto.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
