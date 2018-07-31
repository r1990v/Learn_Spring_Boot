package io.learn.springbootapi.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic(1,"The Hindu","Provides awesome content for civil services aspirants"),
				new Topic(2,"Times Of India","Provides good content on weekdays")
				));
	
	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopic(int id) {
		// Get specific topic using topic id
		for (Topic individualTopic: topics)
		{
			if(individualTopic.topicID==id)
				return individualTopic;
		}
		return new Topic(0,"Topic id not found in the topic list","No Description");
	}

	public int addTopic(Topic topic) {
		topics.add(topic);
		return 1;
	}

	public int updateTopic(int id, Topic topic) {
		int returnValue=0;
		for(int i=0;i< topics.size();i++)
		{
			Topic t = topics.get(i);
			if(t.getTopicID()==id)
			{
				topics.set(i, topic);
				returnValue = 1;
			}
			
		}
		
		return returnValue;
	}

	public int deleteTopic(int id) {

		int returnValue=0;
		for(int i=0;i< topics.size();i++)
		{
			Topic t = topics.get(i);
			if(t.getTopicID()==id)
			{
				topics.remove(i);
				returnValue = 1;
			}
			
		}
		return returnValue;
	}
}
