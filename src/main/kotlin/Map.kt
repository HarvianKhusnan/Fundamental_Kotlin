/*
Map biasa digunaka nuntuk menyimpan data dengan format key-value
 */

fun main() {
    val capital = mapOf(
        /*
        String yang berada dikiri dari kata to adalah sebuah key sedangkan disebelah kanan adalah value nya
         */
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"]) //output yang dikeluarkan adalah Indonesia
    println(capital.getValue("Jakarta")) // atau juga bisa menggunakan fungsi ini untuk mengambil value dari jakarta

    /*
    untuk menampilkan keys apa saja yang ada di capital bisa menggunakan kode dibawah ini
     */

    val mapKeys = capital.keys //mapKeys [Jakarta,London,New Delhi]
    val mapValues = capital.values //mapValues [Indonesia, England, India]

    /*
    Untuk menjadikan map kita mutable kita perlu menambah beberapa kode seperti dibawah ini
     */

    val mutableCapital = capital.toMutableMap() // ini akan menjadikan map kita Mutable

    // dan untuk menambahkan key-value baru bisa dengan kode dibawah ini
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
}