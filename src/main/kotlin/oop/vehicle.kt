package oop

import java.awt.Color
import javax.script.AbstractScriptEngine

class vehicle(owner:String,colour: String,brand:String,price:Int, engine:String){
    init {
        println("Owner of the House is $owner")
        println("colour of car is $colour")
        println("Price is $price")
        println("Type of engine is $engine")
        println("Brand is $brand")
    }

}

fun main(args: Array<String>) {
    var owner_1 = vehicle("Njogu","maroon","BMW",1000000000,"V6")
    println("...end of vehicle 1...")
    var owner_2 = vehicle("Njeru","black","Benz",950000000,"V7")
    println("...end of vehicle 2...")
    var owner_3 = vehicle("Njagi","white","Honda",850000000,"V8")
    println("...end of vehicle 3...")
    var owner_4 = vehicle("joe","blue","Mazda",550000000,"V9")
    println("...end of vehicle 4...")
    var owner_5 = vehicle("mary","cream","Toyota",450000000,"V6")
    println("...end of vehicle 5...")
}
