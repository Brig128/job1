fun main() {
    println("Добрый день, намного проще, чем требуется, но я только начинаю путь")



   
    println("Введите число: ")

    var first = readLine()?.toDoubleOrNull()

    println("Введите второе число: ")

    var second = readLine()?.toDoubleOrNull()

    println("Выберите оператор (+ - * /)")

    var operator = readLine()

    print("$first $operator $second = ")

    if (first==null || second==null || operator.isNullOrEmpty()){
        println("Неправильный ввод")
    }
else {
        var result = calculate(first, second, operator)
   println("$result - результат")
    }

}

fun calculate(fir: Double, sec: Double, op: String): Double{
    var res = 0.0

    when (op){
        "+" -> res = fir+sec
        "-" -> res = fir-sec
        "/" -> res = fir/sec
        "*" -> res = fir*sec
    }
    return res
}





