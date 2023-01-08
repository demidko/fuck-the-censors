export function obfuscated(text) {
  let result = ""
  for (const source of text) {
    const replacement = replacements[source]
    result += replacement ? replacement : source
  }
  return result
}

const replacements = {

  // Russian

  'А': 'A',
  'а': 'a',
  'Б': 'Ƃ',
  'б': 'ნ',
  'В': 'B',
  'в': 'ʙ',
  'Г': 'Γ',
  'г': 'ᴦ',
  'Д': 'Д',
  'д': 'д',
  'Е': 'E',
  'е': 'e',
  'Ё': 'E',
  'ё': 'e',
  'Ж': 'Ж',
  'ж': 'ж',
  'З': '3',
  'з': 'ɜ',
  'И': 'ⵍ',
  'и': 'ᥢ',
  'Й': 'Ѝ',
  'й': 'ѝ',
  'К': 'K',
  'к': 'ĸ',
  'Л': 'Л',
  'л': 'ᴫ',
  'М': 'M',
  'м': 'ᴍ',
  'Н': 'H',
  'н': 'ʜ',
  'О': 'O',
  'о': 'o',
  'П': 'Π',
  'п': 'п',
  'Р': 'P',
  'р': 'p',
  'С': 'C',
  'с': 'c',
  'Т': 'T',
  'т': 'ᴛ',
  'У': 'У',
  'у': 'y',
  'Ф': 'Φ',
  'ф': 'ⱇ',
  'Х': 'X',
  'х': 'x',
  'Ц': 'Ц',
  'ц': 'ц',
  'Ч': 'Ⴗ',
  'ч': 'ɥ',
  'Ш': 'Ш',
  'ш': 'ꟺ',
  'Щ': 'Щ',
  'щ': 'щ',
  'Ъ': 'Ⴆ',
  'ъ': 'ъ',
  'Ы': 'Ы',
  'ы': 'ы',
  'Ь': 'ߕ',
  'ь': 'ь',
  'Э': '℈',
  'э': '϶',
  'Ю': 'Ю',
  'ю': 'ю',
  'Я': 'ᖆ',
  'я': 'ᴙ',

  // English

  'A': 'А',
  'a': 'а',
  'B': 'В',
  'b': 'ᖯ',
  'C': 'С',
  'c': 'с',
  'D': 'Ⅾ',
  'd': 'ⅾ',
  'E': 'Е',
  'e': 'е',
  'F': 'ᖴ',
  'f': 'ｆ',
  'G': 'Ꮐ',
  'g': 'ɡ',
  'H': 'Н',
  'h': 'һ',
  'I': 'Ι',
  'i': 'і',
  'J': 'Ј',
  'j': 'ϳ',
  'K': 'К',
  'k': 'ｋ',
  'L': 'Ꮮ',
  'l': 'ⅼ',
  'M': 'М',
  'm': 'ⅿ',
  'N': 'Ν',
  'n': 'ᥒ',
  'O': 'О',
  'o': 'о',
  'P': 'Р',
  'p': 'р',
  'Q': 'Ԛ',
  'q': 'ｑ',
  'R': 'Ꭱ',
  'r': 'ｒ',
  'S': 'Ѕ',
  's': 'ѕ',
  'T': 'Т',
  't': 'ｔ',
  'U': 'Ｕ',
  'u': 'ᥙ',
  'V': 'Ꮩ',
  'v': 'ᴠ',
  'W': 'Ꮃ',
  'w': 'ᴡ',
  'X': 'Х',
  'x': 'х',
  'Y': 'Υ',
  'y': 'у',
  'Z': 'Ζ',
  'z': 'ᴢ'
}

