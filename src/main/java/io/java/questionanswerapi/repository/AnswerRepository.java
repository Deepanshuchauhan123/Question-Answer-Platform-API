package io.java.questionanswerapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.java.questionanswerapi.dto.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Integer> {

	public List<Answer> findByQuestionQuestionId(int id);

	public List<Answer> findByUserUserId(int userId);

}
