/*
Data class, data class juga memiliki fitur komparasi konten dengan menggunakan equals()
data class juga memungkinkan kita untuk menyalin sebuah objek dengan mudah yaitu dengan fungsi copy()
 */

class User(val  name: String, val  age : Int){
    /*
    Jika ingin mengeluarkan data yang akan diinputkan, maka harus menggunakan kode dibawah ini
    jika tidak maka akan mengeluarkan alamat address saja.
     */
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name : String, val age : Int)

fun main() {
//    val user = User("nrohmen",17)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val  dataUser4 = dataUser.copy()

//    println(user)
//    println(dataUser)
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    print(dataUser4)



}