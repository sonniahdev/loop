
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // Available mobile data packages
    val packages = listOf(
        Package("1GB", 100),
        Package("5GB", 500),
        Package("10GB", 1000)
    )

    println("Available packages:")
    for ((index, p) in packages.withIndex()) {
        println("${index + 1}. ${p.name} - KES ${p.price}")
    }

    // User selects a package
    print("Select package: ")
    val packageIndex = scanner.nextInt() - 1
    val selectedPackage = packages[packageIndex]

    // User enters mobile number
    print("Enter mobile number: ")
    val mobileNumber = scanner.next()

    // Confirm purchase
    println("You are about to buy ${selectedPackage.name} for KES ${selectedPackage.price} for $mobileNumber.")
    print("Confirm? (y/n): ")
    val confirmation = scanner.next()

    if (confirmation == "y") {
        // Purchase successful
        println("Purchase successful!")
    } else {
        // Purchase cancelled
        println("Purchase cancelled.")
    }
}

data class Package(val name: String, val price: Int)