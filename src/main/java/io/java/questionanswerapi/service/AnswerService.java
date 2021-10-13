package io.java.questionanswerapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.questionanswerapi.dto.Answer;
import io.java.questionanswerapi.repository.AnswerRepository;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepository answerRepository;

	public List<Answer> getAnswersById(int id) {
		List<Answer> answerList = new ArrayList<Answer>();
		answerRepository.findByQuestionQuestionId(id).forEach(answerList::add);
		return answerList;
	}

	public List<Answer> getAnswersByUserId(int userId) {
		List<Answer> answerList = new ArrayList<Answer>();
		answerRepository.findByUserUserId(userId).forEach(answerList::add);
		return answerList;
	}

	public void addAnswer(Answer answer) {
		answerRepository.save(answer);

	}
}
