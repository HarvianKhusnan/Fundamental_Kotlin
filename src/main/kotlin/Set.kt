/*
Set merupakan sebuah collection untuk menyimpan nilai yag unik saja, dan tidak ada data yang duplikasi
 */

fun main() {
    val integerSet = setOf(1,2,4,2,1,5) // contoh duplikasi data

    println(integerSet) // output akan menghasilkan 1,2,4,5

    /*
    untuk melakukan otomatis pembuangan angka yang duplikasi, maka harus menggunakan fungsi setOf
     */

    val setA = setOf(1,2,4,2,1,5)
    val setB = setOf(1,2,4,5)
    val setC = setOf(1,5,7)

    println(setA == setB) // output akan mengeluarkan true

    //set juga bisa melakukan pengecekan apakah didalam sebuah set terdapat sebuah nilai dengan kode in

    print(5 in setA) //mengecek apakah angka 5 ada di setA jika iya maka akan mengeluarkan output true

    //set juga bisa mengecek gabungan dan irisanm dari 2 buah set

    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    /*
    Output dari gabungan dan irisan
    union : [1,2,4,5,7]
    intersect : [1,5]
     */


}