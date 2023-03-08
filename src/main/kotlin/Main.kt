fun main() {
    print("Masukkan angka : ")
    val number = readLine()?.toIntOrNull()

    if (number == null) {
        println("Input tidak valid")
    } else if (isPrima(number)) {
        println("$number adalah bilangan prima")
    } else {
        println("$number bukan bilangan prima")
    }
}

fun isPrima(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    for (i in 2..number / 2) {
        if (number % i == 0) {
            return false
        }
    }
//cek
    return true
}
