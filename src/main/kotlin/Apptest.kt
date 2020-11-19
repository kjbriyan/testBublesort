import java.util.*

object Apptest {
    @JvmStatic
    fun main(args: Array<String>) {
        //    Buat Objek Scanner
        val scan = Scanner(System.`in`)

        //    Input jumlah Data
        print("Masukkan jumlah Data : ")
        val jlh_data: Int = scan.nextInt()

        //    Input nilai tiap Data
        val data = IntArray(jlh_data) //    Array untuk menampung nilai tiap Data
        println()
        for (a in 0 until jlh_data) {
            print("Nilai Data ke-" + (a + 1) + " : ")
            data[a] = scan.nextInt()
        }

        //    Tampilkan Data Sebelum di Sorting
        println("\nData Sebelum di Sorting")
        for (a in 0 until jlh_data) print(data[a].toString() + " ")

        //    Proses Bubble Sort
        println("\nProses Bubble Sort")
        for (a in 0 until jlh_data) {
            println("Iterasi ke-" + (a + 1) + " :")
            for (b in 0 until jlh_data) print(data[b].toString() + "  ")
            println("   Bandingkan " + data[0] + " dengan " + data[1])
            for (b in 0 until jlh_data - 1) {
                var pesan = "   Tidak ada pertukaran"
                if (data[b] > data[b + 1]) {
                    //    proses pertukaran nilai Data
                    pesan = "   Data " + data[b] + " ditukar dengan " + data[b + 1]
                    val temp = data[b] //    Variable Sebagai pihak ketiga
                    data[b] = data[b + 1]
                    data[b + 1] = temp
                }
                if (b < jlh_data - (a + 1)) {
                    for (c in 0 until jlh_data) print(data[c].toString() + "  ")
                    println(pesan)
                }
            }
            println("\n")
        }

        //    Tampilkan Data Setelah di Sorting
        print("Data Setelah di Sorting : ")
        for (a in 0 until jlh_data) print(data[a].toString() + "  ")
    }
}