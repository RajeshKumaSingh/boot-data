package my.app.topics

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class TopicController {
	
	@Autowired
	lateinit var topicService:TopicService
	
	@RequestMapping("/topics")
	fun getAllTopics():List<Topic>{
		return topicService.getAllTopics()
	}
	
	@RequestMapping("/topics/{id}")
	fun getTopic(@PathVariable("id") id:Long):Topic{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value="/topics", method= arrayOf(RequestMethod.POST))
	fun addTopic(@RequestBody topic:Topic):List<Topic>{
		topicService.addTopic(topic);
		return topicService.getAllTopics()
	}
	
	@RequestMapping(value="/topics/{id}", method= arrayOf(RequestMethod.PUT))
	fun updateTopic(@RequestBody topic:Topic):List<Topic>{
		topicService.updateTopic(topic);
		return topicService.getAllTopics()
	}
	
	@RequestMapping(value="/topics/{id}", method= arrayOf(RequestMethod.DELETE))
	fun deleteTopic(@PathVariable("id") id:Long):List<Topic>{
		topicService.deleteTopic(id);
		return topicService.getAllTopics()
	}
}