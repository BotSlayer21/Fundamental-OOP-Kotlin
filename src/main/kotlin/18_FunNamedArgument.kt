//Contoh Modul Function Named Argument
/*fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hi $firstName $middleName $lastName")
}

fun main() {
    fullName(
        firstName = "Rahmad",
        middleName = "Noor",
        lastName = "Iksan"
    )
}*/

//18 Latihan Function Named Argument
fun intro(
    firstName: String,
    middleName: String,
    lastName: String,
    age: Int,
    city: String,
    university: String
) {
    println("Hi, My name $firstName $middleName $lastName," +
            "\nI'am $age years old, and im from $city." +
            " \nRight now im studying at $university ")
}

fun main() {
    intro(
        firstName = "Triantoro",
        middleName = "Rizky",
        lastName = "Anggara",
        age = 21,
        city = "Jambi",
        university = "Dinamika Bangsa University"
    )
}
