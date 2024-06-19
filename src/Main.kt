fun powerWhile(base: Int, exponent: Int): Int {
    var result = 1
    var count = 0

    while (count < exponent) {
        var tempResult = 0
        var addCount = 0
        while (addCount < result) {
            tempResult += base
            addCount++
        }
        result = tempResult
        count++
    }

    return result
}


fun powerFor(base: Int, exponent: Int): Int {
    var result = 1

    for (i in 1..exponent) {
        var tempResult = 0
        for (j in 1..result) {
            tempResult += base
        }
        result = tempResult
    }

    return result
}


fun powerForEach(base: Int, exponent: Int): Int {
    var result = 1

    (1..exponent).forEach {
        var tempResult = 0
        (1..result).forEach {
            tempResult += base
        }
        result = tempResult
    }

    return result
}



// Пример вызова функции
fun main() {
    val base = 3
    val exponent = 4

    val result1 = powerWhile(base, exponent)
    println("Результат c помощью While: $result1") // Ожидается 81

    val result2 = powerFor(base, exponent)
    println("Результат c помощью For: $result2") // Ожидается 81

    val result3 = powerForEach(base, exponent)
    println("Результат c помощью ForEach: $result3") // Ожидается 81
}