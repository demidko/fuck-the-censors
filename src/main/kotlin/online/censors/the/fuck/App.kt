package online.censors.the.fuck

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootConfiguration
@EnableAutoConfiguration
class App {

  @Bean
  fun replacer(): Replacer {
    return Replacer(
      'А' to 'A',
      'а' to 'a',
      'б' to '?',
    )
  }

  @Bean
  fun api(): Api {
    return Api(replacer())
  }
}

fun main(args: Array<String>) {
  runApplication<App>(*args)
}
