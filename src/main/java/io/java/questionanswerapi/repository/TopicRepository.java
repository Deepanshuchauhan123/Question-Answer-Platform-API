package io.java.questionanswerapi.repository;

import org.springframework.data.repository.CrudRepository;

import io.java.questionanswerapi.dto.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer> {

}
