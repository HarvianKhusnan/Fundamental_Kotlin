/*
When Expressions bisa digunakan layaknya if else expression
 */

fun main() {
    val value = 7

    /*
    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

     */

    // when expression, juga bisa dijadikan 1 value seperti dibawah ini
//    val stringValue = when (value) {
//        6 -> "value is 6"
//        7 -> "value is 7"
//        8 -> "value is 8"
//        else -> "value cannot be reached"
//    }

//    println(stringValue)

    /*
    Jika ingin menggunakan when, tetapi ingin menjalankan dua atau lebih baris kode bisa menggunakan
    curly barces seperti dibawah ini
     */
    val stringOfValue = when (value){
        6 -> {
            println("six")
            "value is 6"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)

}