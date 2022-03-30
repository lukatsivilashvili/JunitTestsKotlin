fun main() {
    val calc = StringCalculator()
    println(calc.add("//;\n1;2;3;4"))
}


class StringCalculator {
    fun add(numString: String): Int {
        var sum = 0
        val nums = numString.split(getCustomDelimiter(numString), "\n")
        for (num in nums) {
            if (num.isNotEmpty() && num.first().isDigit()) {
                sum += num.toInt()
            }
        }
        return sum
    }
}

fun getCustomDelimiter(numString: String): String {

    val list = numString.split('\n')
    return if (list.size == 2) {
        list[0].last().toString()
    } else {
        ","
    }
}
