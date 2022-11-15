package online.censors.the.fuck

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import kotlin.reflect.KFunction

@SpringBootTest
class AppTest {

  @Autowired
  private lateinit var context: ApplicationContext

  private inline fun <reified T> getBean(bean: KFunction<T>): T {
    return context.getBean(bean.name, T::class.java)
  }

  @Test
  fun testReplace() {
    val replacer = getBean(App::replacer)
    val texts = listOf("быстро", "караси", "лунтик", "бубба")
    for(oldText in texts) {
      val newText = replacer.obfuscate(oldText)
      assertThat(newText).isNotEqualTo(oldText)
    }
  }
}