import java.util.*
import kotlin.collections.ArrayList

class BankClass {

    private val sc = Scanner(System.`in`)

    private var name = ""
    private var bal:Double = 0.0
    private var pin:Int = 0
    private val hist = ArrayList<String>()

    fun init(){
        getName()
        getBal()
        getPin()
    }

    private fun getName(){
        println("What is your name : ")
        name = sc.nextLine()
        println("Hello $name")
    }

    private fun getBal(){
        println("What is your starting balance : ")
        bal = sc.nextLine().toDouble()
        println("Starting balance is $bal")
    }

    private fun getPin(){
        println("Enter a 4 digit pin number")
        pin = sc.nextLine().toInt()
        println("Account initialized with name $name and balance $bal")
    }

    fun goodBye(){
        println("Thank you for using this bank $name, your final balance is $bal")
    }

    fun deposit(){
        if(pinCheck()){
            println("How much do you want to deposit : ")
            val depVal = sc.nextLine().toInt()
            bal += depVal
            hist.add("deposited : $depVal, final balance: $bal")
            println("($depVal has been deposited into your account, Your balance is now $bal)")
        }else{
            println("You have entered the wrong pin")
        }
    }

    fun withdraw(){
        if(pinCheck()){
            println("How much do you want to withdraw : ")
            val withVal = sc.nextLine().toInt()
            bal -= withVal
            hist.add("deposited : $withVal, final balance: $bal")
            println("($withVal has been withdrawn from your account, You balance is now $bal)")
        } else {
            println("You have entered the wrong pin")
        }
    }

    fun getHist(){
        if(pinCheck()){
            println(hist)
        } else {
            println("You have entered the wrong pin")
        }
    }

    private fun pinCheck() : Boolean{
        println("Please enter your pin number")
        val iPin = sc.nextLine().toInt()
        if(iPin == pin){
            return true
        }
        return false
    }




}