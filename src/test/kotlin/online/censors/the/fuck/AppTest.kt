package online.censors.the.fuck

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AppTest {

  @Autowired
  private lateinit var replacer: Replacer

  @Test
  fun testReplace() {
    // todo тут пара слов для примера (больше и не надо, так как Replacer проводит проверки на уровне типа)
  }
}