fun main(args: Array<String>) {
    var pin:Int
    do {
        println("Enter your pin")
        pin = readLine()!!.toInt()

    } while (pin != 1245)
    println("correct pin")
}