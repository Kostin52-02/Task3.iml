fun main() {
    println("enter a natural number:")
    val input = readlnOrNull() ?: return

    try {
        val decimal = input.toInt() // преобразуем строку в число
        if (decimal < 0) throw NumberFormatException()
        val binary = decimal.toString(2)
        println("binary representation: $binary")
    } catch (e: NumberFormatException) {
        println("Please enter a natural number.")
    }
}
