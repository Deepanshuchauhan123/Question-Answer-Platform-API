package io.java.questionanswerapi.repository;

import org.springframework.data.repository.CrudRepository;

import io.java.questionanswerapi.dto.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

}
