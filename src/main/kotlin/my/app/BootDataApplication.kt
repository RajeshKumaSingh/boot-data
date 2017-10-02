package my.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan("my.app.*")
class BootDataApplication

fun main(args: Array<String>) {
    SpringApplication.run(BootDataApplication::class.java, *args)
}
