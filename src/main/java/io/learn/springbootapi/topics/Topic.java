package io.learn.springbootapi.topics;

public class Topic {
	
	String topicDesc;
	int topicID;
	String topicName;
	
	
	public Topic() {
	}
	
	public Topic(int topicID, String topicName,String topicDesc) {
		super();
		this.topicDesc = topicDesc;
		this.topicID = topicID;
		this.topicName = topicName;
	}
	public String getTopicDesc() {
		return topicDesc;
	}
	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}
	public int getTopicID() {
		return topicID;
	}
	public void setTopicID(int topicID) {
		this.topicID = topicID;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
	
	
}
