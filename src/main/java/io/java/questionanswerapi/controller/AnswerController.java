package io.java.questionanswerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.java.questionanswerapi.dto.Answer;
import io.java.questionanswerapi.service.AnswerService;

@RestController
public class AnswerController {

	@Autowired
	private AnswerService answerService;

	@RequestMapping("/question/{id}/answer")
	public List<Answer> getAnswersByQuestionId(@PathVariable int id) {

		return answerService.getAnswersById(id);
	}

	@RequestMapping("/question/{questionId}/answer/user/{id}")
	public List<Answer> getAnswersByUserId(@PathVariable int id) {
		return answerService.getAnswersByUserId(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/question/{id}/answer")
	public void addAnswer(@RequestBody Answer answer) {
		answerService.addAnswer(answer);
	}

}
