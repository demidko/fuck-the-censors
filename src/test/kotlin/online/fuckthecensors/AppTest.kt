package online.fuckthecensors

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AppTest {

  @Autowired
  private lateinit var api: Api

  @Test
  fun testApi() {
    assertThat(api.obfuscate("Текст")).isNotEqualTo("Текст")
    assertThat(api.obfuscate("Text")).isNotEqualTo("Text")
    assertThat(api.obfuscate("Слово")).isNotEqualTo("Слово")
    assertThat(api.obfuscate("Word")).isNotEqualTo("Word")
    assertThat(api.obfuscate("Цензура")).isNotEqualTo("Цензура")
    assertThat(api.obfuscate("Censorship")).isNotEqualTo("Censorship")
  }
}