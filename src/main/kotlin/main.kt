import kotlin.random.Random

fun main() {
    val meloman = Random.nextBoolean()
    val payment = (0..10_000).random()
    var discount: Double

    if (payment in 0..1_000)
        discount = payment.toDouble()
    else if (payment in 1_001..10_000)
        discount = (payment - 100).toDouble()
    else
        discount = payment * 0.95

    if (meloman)
        discount *= 0.99

    println("Сумма покупки $payment рублей")
    println("Сумма покупки со скидкой составляет $discount рублей")

}