//Contoh Modul String Template
/*
fun main() {
    val company = "Infinite Learning"
//  print("We are study in " + company)
    print("We are study in $company")
}*/

//11 Latihan String Template
fun main () {
    val nama = "Triantoro Rizky Anggara"
    val umur = 21
    val asalUniversitas = "Universitas Dinamika Bangsa"
    val jurusan = "Sistem Informasi"
    val perkenalan = "Halo, perkenalkan namaku $nama, \n" +
            "umurku $umur tahun, " +
            "saat ini berkuliah di $asalUniversitas " +
            "jurusan $jurusan"
    println(perkenalan)
}