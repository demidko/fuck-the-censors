package online.fuckthecensors

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Api(private val replacer: Replacer) {

  @PostMapping("/obfuscate")
  fun obfuscate(@RequestBody text: String?): String {
    return text?.let(replacer::obfuscate) ?: ""
  }
}