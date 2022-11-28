import java.util.Scanner;

fun main() {
    val sc = Scanner(System.`in`)
    var isRunning:Boolean = true;
    val bc = BankClass()
    bc.init()
    while(isRunning){
        isRunning = input(sc, bc)
    }
}

fun input(sc : Scanner, bc : BankClass) : Boolean{
    println("Enter D to Deposit, Enter W to Withdraw, Enter H to check history, Enter N to stop")
    return when (sc.nextLine()) {
        "D" -> {
            bc.deposit()
            true
        }
        "W" -> {
            bc.withdraw()
            true
        }
        "N" -> {
            bc.goodBye()
            false
        }
        "H" -> {
            bc.getHist()
            true
        }
        else -> {
            false
        }
    }
}



