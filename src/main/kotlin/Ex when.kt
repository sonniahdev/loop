
fun main() {
    val packageCodes = mapOf(
        "1" to "1GB",
        "2" to "5GB",
        "3" to "10GB"
    )

    // User dials *544#
    println ("Dial *544# to buy mobile data.")

    // User selects a package by entering a code
    println("Select a package:")
    for ((code, name) in packageCodes) {
        println("$code. $name")
    }
    print("Enter package code: ")
    val packageCode = readLine()

    // User confirms purchase
    println("You are about to buy ${packageCodes[packageCode]} for KES ${getPrice(packageCode)}.")
    print("Confirm? (y/n): ")
    val confirmation = readLine()

    if (confirmation == "y") {
        // Purchase successful
        println("Purchase successful!")
    } else {
        // Purchase cancelled
        println("Purchase cancelled.")
    }
}

fun getPrice(packageCode: String?): Int {
    return when (packageCode) {
        "1" -> 100
        "2" -> 500
        "3" -> 1000
        else -> 0
    }
}