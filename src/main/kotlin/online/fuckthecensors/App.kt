package online.fuckthecensors

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootConfiguration
@EnableAutoConfiguration
class App {

  @Bean
  fun replacer() = Replacer(

    // Russian

    'А' to 'A',
    'а' to 'a',
    'Б' to 'Ƃ',
    'б' to 'ნ',
    'В' to 'B',
    'в' to 'ʙ',
    'Г' to 'Γ',
    'г' to 'ᴦ',
    'Д' to 'Д',
    'д' to 'д',
    'Е' to 'E',
    'е' to 'e',
    'Ё' to 'E',
    'ё' to 'e',
    'Ж' to 'Ж',
    'ж' to 'ж',
    'З' to 'ვ',
    'з' to 'ɜ',
    'И' to 'ⵍ',
    'и' to 'ᥢ',
    'Й' to 'Ѝ',
    'й' to 'ѝ',
    'К' to 'K',
    'к' to 'ĸ',
    'Л' to 'Л',
    'л' to 'ᴫ',
    'М' to 'M',
    'м' to 'ᴍ',
    'Н' to 'H',
    'н' to 'ʜ',
    'О' to 'O',
    'о' to 'o',
    'П' to 'Π',
    'п' to 'п',
    'Р' to 'P',
    'р' to 'p',
    'С' to 'C',
    'с' to 'c',
    'Т' to 'T',
    'т' to 'ᴛ',
    'У' to 'У',
    'у' to 'y',
    'Ф' to 'Φ',
    'ф' to 'ⱇ',
    'Х' to 'X',
    'х' to 'x',
    'Ц' to 'Ц',
    'ц' to 'ц',
    'Ч' to 'Ⴗ',
    'ч' to 'ɥ',
    'Ш' to 'Ш',
    'ш' to 'ꟺ',
    'Щ' to 'Щ',
    'щ' to 'щ',
    'Ъ' to 'Ⴆ',
    'ъ' to 'ъ',
    'Ы' to 'Ы',
    'ы' to 'ы',
    'Ь' to 'ߕ',
    'ь' to 'ხ',
    'Э' to '℈',
    'э' to '϶',
    'Ю' to 'Ю',
    'ю' to 'ю',
    'Я' to 'ᖆ',
    'я' to 'ᴙ',

    // English

    'A' to 'А',
    'a' to 'а',
    'B' to 'В',
    'b' to 'ᖯ',
    'C' to 'С',
    'c' to 'с',
    'D' to 'Ⅾ',
    'd' to 'ⅾ',
    'E' to 'Е',
    'e' to 'е',
    'F' to 'ᖴ',
    'f' to 'ｆ',
    'G' to 'Ꮐ',
    'g' to 'ɡ',
    'H' to 'Н',
    'h' to 'һ',
    'I' to 'Ι',
    'i' to 'і',
    'J' to 'Ј',
    'j' to 'ϳ',
    'K' to 'К',
    'k' to 'ｋ',
    'L' to 'Ꮮ',
    'l' to 'ⅼ',
    'M' to 'М',
    'm' to 'ⅿ',
    'N' to 'Ν',
    'n' to 'ᥒ',
    'O' to 'О',
    'o' to 'о',
    'P' to 'Р',
    'p' to 'р',
    'Q' to 'Ԛ',
    'q' to 'ｑ',
    'R' to 'Ꭱ',
    'r' to 'ｒ',
    'S' to 'Ѕ',
    's' to 'ѕ',
    'T' to 'Т',
    't' to 'ｔ',
    'U' to 'Ｕ',
    'u' to 'ᥙ',
    'V' to 'Ꮩ',
    'v' to 'ᴠ',
    'W' to 'Ꮃ',
    'w' to 'ᴡ',
    'X' to 'Х',
    'x' to 'х',
    'Y' to 'Υ',
    'y' to 'у',
    'Z' to 'Ζ',
    'z' to 'ᴢ'
  )

  @Bean
  fun api() = Api(replacer())
}

fun main(args: Array<String>) {
  runApplication<App>(*args)
}
