fun main() {
    minimumOf(5,7)
    rangeOf(4)
    inferredTypeOf(0.0F)
    stringContains("wordle")
}

fun minimumOf(number1: Long, number2: Long){
    when {
        number1 < number2 -> println(""""
            | number 1 is less then number 2 
            | -> $number1 < $number2
            """.trimMargin())
        number1 >= number2 -> println(""""
            | number 1 is greater or equal then number 2 
            | -> $number1 >= $number2
            """.trimMargin())
    }
}

fun rangeOf(number: Int){
    when {
        number <= 0 -> println("number: $number is 0 or below")
        number in 1..5 -> println("number: $number is between 1 and 5")
        number in 6..10 -> println("number: $number is between 6 and 10")
        number in 11..20 -> println("number: $number is between 11 and 20")
        number >= 21 -> println("number: $number is 21 or greater")
    }
}

fun inferredTypeOf(variable: Any){
    when (variable) {
        is Int -> println("variable: $variable is an Integer")
        is Long -> print("variable: $variable is a Long")
        is Float -> println("variable: $variable is a Float")
        is Double -> println("variable: $variable is a Double")
        is Boolean -> println("variable: $variable is a Boolean")
        else -> println("variable: $variable is a not one of the following: Int, Long, Double, Float, Boolean")
    }
}

fun stringContains(str : String){
    when {
        str.contains("A") -> println("String contains A")
        str.contains("B") -> println("String contains B")
        str.contains("C") -> println("String contains C")
        str.isEmpty() -> println("String is empty")
        else -> println("String: \"$str\" does not contain A, B or C and is not empty")
    }
}
