package my.app.topics

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.Entity
import javax.persistence.Id
import org.springframework.stereotype.Repository

@Entity
data class Topic (var name:String="",@Id var id:Long=0, var des: String=""){
	
}

@Repository
interface TopicRepository : JpaRepository<Topic, Long>