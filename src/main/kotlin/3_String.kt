/*Contoh Modul Data Types (String)*/
/*fun main() {
    val stringText = "Kotlin Language"
    val firstChar = stringText[0]
    // 0 itu mendefinisikan array dari data stringText, jadi yang muncul huruf K
    // Begitupun seterusnya, jika 1 maka muncul huruf o
    println("First Character of $stringText is $firstChar")
}*/

//3 Latihan Data Types (String)
fun main() {
   val kalimat = "Kota Jambi"
   val hurufPertama = kalimat[0]
   val hurufTengah = kalimat[kalimat.length/2]
   val hurufterakhir = kalimat[kalimat.length - 1]
   println("Huruf pertama dari $kalimat adalah $hurufPertama")
   println("Huruf Tengah dari $kalimat adalah $hurufTengah")
   println("Huruf terakhir dari $kalimat adalah $hurufterakhir")
}