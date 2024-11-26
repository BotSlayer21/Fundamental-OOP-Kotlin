fun title(
    name: String,
    assigment: String,
    desc: String,
) {
    println("Halo, my name $name in this project i make an $assigment" +
            "I made this project to $desc")
}

fun main() {
    title(
        name = "Triantoro Rizky Anggara",
        assigment = "Fundamental OOP Kotlin",
        desc = "fullfil an assignment from Infinite Learning"
    )
}