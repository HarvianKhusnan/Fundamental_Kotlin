/*
Collections Operations mempunyai tujuan untuk menjalankan fungsi operasi yang bisa digunakan
untuk mengakses data didalamnya
 */

// Filter dan filterNot()

fun main () {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    val eventList = numberList.filter { it % 2 == 0 } // fungsi dari kode ini untuk menyaring angka yang habis dibagi oleh 2
    val notEvenList = numberList.filterNot { it % 2 == 0 } // fungsi dari kode ini untuk menyaring angka tidak habis jika dibagi 2
    val multipliedBy5 = numberList.map { it * 5 } // kode ini akan melakukan perkalian dengan 5 pada semua isi dari list
    val firstOddNumber = numberList.find { it % 2 == 1 } // akan melakukan pencarian bilangan ganjil pertama
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 } // fungsinya sama seperti find, tetapi akan mengeluarkan null jika tidak terdapat angka yang di inginkan
    val total = numberList.sum() // untuk melakukan fungsi sum


    print(eventList) // output [2,4,6,8,10]
    print(notEvenList) //output [1,3,5,7,8,9]
    print(numberList.count()) // akan menghitung jumlah item yang ada di dalam list
    val ascendingSort = kotlinChar.sorted() // melakukan sorted
    println(ascendingSort)
}