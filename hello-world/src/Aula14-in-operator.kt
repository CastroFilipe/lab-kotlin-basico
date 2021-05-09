fun main(){

    println(isLetter('w')) //true, is a letter
    println(isLetter('3')) // false, is not Letter
    println(isNotNumber('b')) //true is not a number
    println(isNotNumber('2')) //false is a number
}

fun isLetter(c: Char): Boolean = c in 'a'..'z' || c in 'A'..'Z'

fun isNotNumber(c: Char): Boolean = c !in '0'..'9'