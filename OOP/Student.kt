package OOP

class Student {
    var name = ""
    var roll = ""
    var age = ""
    var address = ""
}

fun main() {

    var info = Student()

    info.name="Al-Amin"
    info.roll="901253"
    info.age="2000"
    info.address="Joypurhat"

    println(info.name)
    println(info.roll)
    println(info.age)
    println(info.address)
}