package io.java.questionanswerapi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int questionId;

	private String question;

	@OneToMany
	@JoinColumn(name = "Question_Id", referencedColumnName = "questionId")
	private List<Company> company;

	private String tags;

	@OneToMany
	@JoinColumn(name = "Question_Id", referencedColumnName = "questionId")
	private List<Topic> topic;

	@ManyToOne
	@JoinColumn(name = "User_Id", referencedColumnName = "userId")
	private User user;

	public Question() {
		super();
	}

	public Question(int questionId, String question, List<Company> company, String tags, List<Topic> topic, User user) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.company = company;
		this.tags = tags;
		this.topic = topic;
		this.user = user;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Company> getCompany() {
		return company;
	}

	public void setCompany(List<Company> company) {
		this.company = company;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public List<Topic> getTopic() {
		return topic;
	}

	public void setTopic(List<Topic> topic) {
		this.topic = topic;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
