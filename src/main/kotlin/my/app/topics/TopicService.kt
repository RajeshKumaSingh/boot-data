package my.app.topics

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TopicService {

	@Autowired
	lateinit var topicRepository : TopicRepository
	
	val topics = mutableListOf(Topic("First", 1, "First topic"),Topic("Second", 2, "Second topic"),
			Topic("Third", 3, "Third topic"));
	
	fun getAllTopics():List<Topic>{
		return topicRepository.findAll();
	}
	
	fun getTopic(id:Long):Topic{
		//return topics.filter { t -> t.id.equals(id) }.first()
		return topicRepository.findById(id).get();
	}
	
	fun addTopic(topic:Topic):List<Topic>{
		//topics.add(topic)
		//return topics
		topicRepository.save(topic)
		return topicRepository.findAll();
	}
	
	fun updateTopic(topic:Topic):List<Topic>{
		/*for(i in 0..topics.size-1){
			var t = topics.get(i)
			if(t.id.equals(id)){
				topics.set(i,topic)
				break
			}
		}
		return topics*/
		topicRepository.save(topic)
		return topicRepository.findAll();
	}
	
	fun deleteTopic(id:Long):List<Topic>{
		/*for(i in 0..topics.size-1){
			var t = topics.get(i)
			if(t.id.equals(id)){
				topics.remove(t)
				break
			}
		}
		return topics*/
		topicRepository.deleteById(id)
		return topicRepository.findAll();
	}
}