package online.censors.the.fuck

class Replacer(vararg replace: Pair<Char, Char>) {

  private val replacements = replace.toMap()

  init {
    // todo checkCyrillic()
  }

  private fun checkCyrillic() {
    val capitalLetters = 'А'..'Я'
    check(capitalLetters.count() == 32)
    val smallLetters = 'а'..'я'
    check(smallLetters.count() == 32)
    for (x in capitalLetters + smallLetters) {
      check(replace(x) != x) { "Replacement $x not found" }
    }
  }

  private fun replace(c: Char) = replacements[c] ?: c

  fun obfuscate(text: String) = text.map(::replace).joinToString("")
}