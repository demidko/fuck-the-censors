package online.censors.the.fuck

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
    'Щ' to 'щ',
    'щ' to 'щ',
    'Ъ' to 'Ⴆ',
    'ъ' to 'ъ',
  )


  @Bean
  fun api() = Api(replacer())
}

fun main(args: Array<String>) {
  runApplication<App>(*args)
}
