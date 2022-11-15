package online.censors.the.fuck

class Replacer(vararg replace: Pair<Char, Char>) {

  private val replacements = replace.toMap()

  init {
    // todo checkCyrillic()
    // todo checkEnglish()
  }

  private fun checkEnglish() {
    checkAlphabet('A'..'Z', 26)
    checkAlphabet('a'..'z', 26)
  }

  private fun checkRussian() {
    checkAlphabet('А'..'Я', 32)
    checkAlphabet('а'..'я', 32)
  }

  private fun checkAlphabet(alphabet: CharRange, count: Int) {
    check(alphabet.count() == count)
    for (letter in alphabet) {
      check(replace(letter) != letter) { "Replacement $letter not found" }
    }
  }

  private fun replace(c: Char) = replacements[c] ?: c

  fun obfuscate(text: String) = text.map(::replace).joinToString("")
}