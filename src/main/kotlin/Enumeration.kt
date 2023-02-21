/*
Enumeration merupakan salah satu fitur yang digunakan untuk menyimpan kumpulan
objek yang telah didefinisikan menjadi tipe data konstanta. contoh code dibawah ini
 */

fun main() {
    /*
    val colors : Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color ")
    }
     */

    //-----------------------------------------------------------------------//
    /*
    val color : Color = Color.valueOf("RED")
    // Ketika menggunakan valueOf harus disamakan dengan enum yang terdefine
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")
     */
    //------------------------------------------------------------------------//

    /*
    //kode dibawah merupakan cara lain untuk mendapatkan daftar objek selain menggunakan valueOf()
    val colors: Array<Color> = enumValues()
    colors.forEach { color ->
        println(color)
    }

    val color: Color = enumValueOf("RED")
    println("Color is $color")
     */

    /*
    Ordinal : digunakan untuk mendapatkan posisi tiap objek
    val color: Color = Color. GREEN
    print("Position Green is ${color.ordinal}")
     */

    /*
    when digunakan untuk melakukan pengecekan instance dari enum.
     */

    val color: Color = Color.GREEN

    when(color) {
        Color.RED -> print("Color is RED")
        Color.BLUE -> print("Color is BLUE")
        Color.GREEN -> print("Color is Green")
    }



}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

// anonymous class untuk perintah yang lebih spesifik

enum class Colors(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}