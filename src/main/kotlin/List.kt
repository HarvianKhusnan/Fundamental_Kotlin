/*
Dalam kotlin kita bisa menuliskan List dengan beberapa cara diantara lain adalah
bisa menggunakan List<Int> dimana yang mengartikan bahwa list memiliki isi bilangan int
atau bisa langsung menginisiasi dengan kode listOf
dan kita juga bisa memasukan list dengan data yang berbeda beda, dan bersifat mutable.
 */

fun main() {
    val NumberList : List<Int> = listOf(1,2,3,4,5) // merupakan contoh default untuk melakukan inisialisasi list

    val numberList = listOf(1,2,3,4,5)
    val charList = listOf('a','b','c')
    val anyList = mutableListOf('a',"kotlin",3,true)

    //contoh mutable dari anyList
    anyList.add('d') // menambah item di akhir list
    anyList.add(1,"love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(0) // menghapus item pada indeks ke-0
}