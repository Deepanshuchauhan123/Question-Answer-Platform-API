package io.java.questionanswerapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.questionanswerapi.dto.Topic;
import io.java.questionanswerapi.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

}
