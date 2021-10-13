package io.java.questionanswerapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.questionanswerapi.dto.Question;
import io.java.questionanswerapi.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	public List<Question> getAllQuestions() {
		List<Question> questionList = new ArrayList<Question>();
		questionRepository.findAll().forEach(questionList::add);

		return questionList;
	}

	public void addQuestion(Question question) {

		questionRepository.save(question);
	}

	public Optional<Question> getQuestionById(int id) {
		return questionRepository.findById(id);
	}

}
