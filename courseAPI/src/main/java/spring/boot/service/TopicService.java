package spring.boot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.boot.domain.Topic;

@Service
public class TopicService {
	
	List<Topic> returnList = new ArrayList<>(Arrays.asList(new Topic(1, "Spring", "Spring Boot"),
										   new Topic(2, "Java", "Java Core"),
										   new Topic(3, "JavaScript", "JavaScript")));
	
	public List<Topic> getAllTopics() {
		return returnList;
	}
	
	public Topic getTopicById(int id) {
		return returnList.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public int addTopic(Topic topic) {
		topic.setId(getAllTopics().size()+1);
		returnList.add(topic);
		return topic.getId();
	}

	public Topic updateTopic(Topic topic) {
		for (int i=0; i<returnList.size(); i++) {
			if (returnList.get(i).getId() == topic.getId()) {
				returnList.set(i, topic);
				break;
			}
		}
		return topic;
	}

	public Topic deleteTopic(int id) {
		Topic t = returnList.get(id);
		returnList.remove(id);
		return t;
	}
	
}
