package my.app.hello

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class HelloController {
	
	@RequestMapping(value="/Hello")
	fun sayHello(): String{
		return "Hi"
	}
}