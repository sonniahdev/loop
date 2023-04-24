import java.time.YearMonth

fun main(args: Array<String>) {
    println("Enter age")
    val age = readLine()!!.toInt()
    if (age >= 50) {
        println("You are old for the party")

    }
    else if (age >= 18){

        println("Welcome to the party")
    }
    else

    {
        println("No entry")
    }




}