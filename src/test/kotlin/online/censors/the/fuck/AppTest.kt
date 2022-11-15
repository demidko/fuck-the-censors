package online.censors.the.fuck

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AppTest {

  @Autowired
  private lateinit var replacer: Replacer

  @Test
  fun testReplace() {
    val texts = listOf("быстро", "караси", "лунтик", "бубба")
    for (oldText in texts) {
      val newText = replacer.obfuscate(oldText)
      assertThat(newText).isNotEqualTo(oldText)
    }
  }
}