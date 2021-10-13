package io.java.questionanswerapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.java.questionanswerapi.dto.Question;
import io.java.questionanswerapi.service.QuestionService;

@RestController
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@RequestMapping("/question")
	public List<Question> getAllQuestion() {
		return questionService.getAllQuestions();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/question")
	public void addQuestion(@RequestBody Question question) {
		questionService.addQuestion(question);
	}

	@RequestMapping("/question/{id}")
	public Optional<Question> getQuestionById(@PathVariable int id) {
		return questionService.getQuestionById(id);
	}

}
