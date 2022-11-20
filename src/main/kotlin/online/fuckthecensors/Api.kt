package online.fuckthecensors

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Api(private val replacer: Replacer) {

  @GetMapping("/obfuscate")
  fun obfuscate(text: String) = replacer.obfuscate(text)
}