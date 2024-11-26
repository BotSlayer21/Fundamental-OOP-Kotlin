//Contoh Modul String Template with expression
/*fun main() {
    val score = 80
    print("Results ${ if (score >= 80) "You Win!" else "Please try again!"}")
}*/

//12 Latihan String Template with expression
fun main() {
    val powerLevel = 7000
    print("Power Status: ${ if (powerLevel >= 8000) 
        "Over 8000! You're a Saiyan warrior!" 
    else "Keep training, you're not strong enough yet!"}")
}
