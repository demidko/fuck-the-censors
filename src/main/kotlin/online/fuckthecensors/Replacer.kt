package online.fuckthecensors

import org.slf4j.LoggerFactory.getLogger

class Replacer(vararg replace: Pair<Char, Char>) {

  private val replacements = replace.toMap()

  init {
    checkAlphabet("Russian", 32, 'А'..'Я', 'а'..'я')
    checkAlphabet("English", 26, 'A'..'Z', 'a'..'z')
  }

  private fun checkAlphabet(name: String, count: Int, vararg alphabet: CharRange) {
    alphabet.all { it.count() == count }.run(::check)
    val log = getLogger(javaClass)
    for (idx in 0 until count) {
      for (set in alphabet) {
        val letter = set.elementAt(idx)
        if (replaced(letter) == letter) {
          log.warn("Replacement '$letter' ($name) not found")
        }
      }
    }
  }

  private fun replaced(c: Char): Char {
    return replacements[c] ?: c
  }

  fun obfuscate(text: String) = buildString {
    for (l in text) {
      append(replaced(l))
    }
  }
}