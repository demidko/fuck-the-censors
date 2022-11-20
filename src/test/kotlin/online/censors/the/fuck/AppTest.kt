package online.censors.the.fuck

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AppTest {

  @Autowired
  private lateinit var api: Api

  @Test
  fun testReplace() {
    assertThat(api.obfuscate("Текст")).isNotEqualTo("Текст")
    assertThat(api.obfuscate("Слово")).isNotEqualTo("Слово")
    assertThat(api.obfuscate("Цензура")).isNotEqualTo("Цензура")
  }
}