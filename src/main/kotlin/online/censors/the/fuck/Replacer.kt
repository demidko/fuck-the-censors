package online.censors.the.fuck

import org.slf4j.LoggerFactory.getLogger

class Replacer(vararg replace: Pair<Char, Char>) {

  private val replacements = replace.toMap()

  init {
    checkAlphabet("Russian", 32, 'А'..'Я', 'а'..'я')
    checkAlphabet("English", 26, 'A'..'Z', 'a'..'z')
  }

  private fun checkAlphabet(name: String, count: Int, vararg letters: CharRange) {
    check(letters.count() == count)
    val log = getLogger(javaClass)
    for (l in letters.asList().flatten()) {
      if (replaced(l) == l) {
        log.warn("Replacement '$l' ($name) not found")
      }
    }
  }

  private fun replaced(c: Char) = replacements[c] ?: c

  fun obfuscate(text: String) = buildString {
    for (l in text) {
      append(replaced(l))
    }
  }
}