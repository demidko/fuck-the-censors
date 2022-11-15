package online.censors.the.fuck

class Replacer(vararg replace: Pair<Char, Char>) {

  init {
    for ((old, new) in replace) {
      check(old != new)
    }
  }

  private val replacements = replace.toMap()

  fun obfuscate(text: String) = text.map { replacements[it] ?: it }.joinToString("")
}