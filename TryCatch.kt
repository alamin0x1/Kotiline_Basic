class TryCatch {
}

fun main() {


    val myNumber : Int = 7

    try {
        val result : Int = myNumber / 0
        println(result)
    }catch (e: ArithmeticException){
        e.printStackTrace()
        println("Something wrong!")
    }

}