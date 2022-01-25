class Calculator {
}

fun main() {

    println("Please Enter your First Number : ")
    val firstNumber : String = readLine()!!

    println("Please Enter your Opator : ")
    val  opator : String = readLine()!!

    println("Please Enter your Second Number : ")
    val secondNumber : String = readLine()!!

    var res : Int = 0 ;


    if (opator == "+"){
        res = firstNumber.toInt() + secondNumber.toInt()
    }else if(opator == "-"){
        res = firstNumber.toInt() - secondNumber.toInt()
    }else if (opator == "*"){
        res = firstNumber.toInt() * secondNumber.toInt()
    }else if (opator == "/"){
        res = firstNumber.toInt() / secondNumber.toInt()
    }else{
        println("Opertator Errro!")
    }
    println("Result is : $res")

}