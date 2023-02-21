/*
Dalam kotlin juga memiliki fitur Destructing Declarations, yang tujuannya untuk memetakan objek menjadi
sebuah variabel dengan menggunakan fungsi componentN() contoh nya seperti dibawah ini
 */

fun main() {
    val dataUser = DataUser("nrohmen",17)

    val name = dataUser.component1()
    val age = dataUser.component2()

    //Bisa juga menggunakan () untuk menjadikan nya 2 komponen seperti dibawah ini

    val (names, ages) = dataUser

    println("My name is $name, i am $age years old")
    println("My name is $names, i am $ages years old")
}