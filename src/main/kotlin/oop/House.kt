package oop

class House(owner:String,location:String, price:Int,doors:Int){
    init {
        println("Owner of the House is $owner")
        println("House is located in $location")
        println("Price is $price")
        println("It has $doors number of doors")
    }


}

fun main(args: Array<String>) {
    var owner_1 = House("Njogu", "Ngara", 25000000,2)
    println("...... end of house 1....")
    var owner_2 = House("Njagi", "langata", 24000000,2)
    println("...... end of house 2....")
    var owner_3 = House("Njeru", "meru", 27000000,2)
    println("...... end of house 3....")
    var owner_4 = House("joe", "tokyo", 45000000,2)
    println("...... end of house 4....")

}


