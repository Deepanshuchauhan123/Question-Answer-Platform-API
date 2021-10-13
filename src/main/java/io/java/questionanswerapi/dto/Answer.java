package io.java.questionanswerapi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int answerId;
	private String answer;

	@ManyToOne
	@JoinColumn(name = "QuestionId", referencedColumnName = "QuestionId")
	private Question question;
	private String date;
	@OneToOne
	@JoinColumn(name = "UserId", referencedColumnName = "UserId")
	private User user;

	public Answer() {

	}

	public Answer(int answerId, String answer, Question question, String date, User user) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
		this.date = date;
		this.user = user;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

}
