//Contoh Modul Safe Calls and Elvis Operator
/*fun main() {
    var dateOut: String? = null
    var status = "Booked"
    status = "Checkout"
    if (status.equals("Checkout")) {
        dateOut = "18/03/2024 13:30:00"
    }
    println(dateOut)
}*/

//13 Latihan Safe call dan Elvis Operator
fun main() {
    val karakter: String? = "Goku"
    val asalPlanet: String? = null

    val karakterLength = karakter?.length
    println("Character Name Length: $karakterLength")

    val planetAsal = asalPlanet ?: "Planet asal not available"
    println("Planet of Origin : $planetAsal")
}