//Contoh Modul Function Default Parameter
/*fun hello(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}

fun main() {
    hello("Nabila")
    hello("Nabilla", "Syafrina")
}*/

//17 Latihan Function Default Parameter
fun greetdriver(namaDepan: String, namaBelakang: String = "") {
    println("Hello nama saya $namaDepan $namaBelakang ")
}
fun main() {
    greetdriver("Valentino")
    greetdriver("Lewis", "Hamilton")
}