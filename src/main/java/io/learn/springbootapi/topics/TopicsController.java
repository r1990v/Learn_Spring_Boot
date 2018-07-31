package io.learn.springbootapi.topics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TopicsController {
	
	@Autowired
	private TopicService ts;

	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		return ts.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable int id) {
		return ts.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public String addTopic(@RequestBody Topic topic){
		int status = ts.addTopic(topic);
		if(status==1)
			return "Added Topic to the list";
		else
			return "Unable to add topic to the list";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public String updateTopic(@RequestBody Topic topic, @PathVariable int id){
		int status = ts.updateTopic(id, topic);
		if(status==1)
			return "Updated Topic Contents";
		else
			return "Unable to update topic as it does not exist in the list";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public String deleteTopic(@RequestBody Topic topic, @PathVariable int id){
		int status = ts.deleteTopic(id);
		if(status==1)
			return "Deleted Topic";
		else
			return "Unable to delete topic as it does not exist in the list";
	}
}
