object SortingArray {
    @JvmStatic
    fun main(args: Array<String>) {
        val array1 = intArrayOf(4, 9, 7, 5, 8, 9, 3)
        bubbleSort(array1)
    }

    fun bubbleSort(array2: IntArray) {
        // Display the array's contents.
        var index: Int // Index of an element to compare
        var temp: Int // Used to swap to elements
        var count = 0

        var swapped = true
        while (swapped == true) {
            swapped = false
            index = 0
            while (index < array2.size - 1) {
                // Compare an element with its neighbor.
                if (array2[index] > array2[index + 1]) {
                    count++
                    // Swap the two elements.
                    print("\n $count [" + array2[index+1] + "," + array2[index]
                    +"] -> ")
                    temp = array2[index]
                    array2[index] = array2[index + 1]
                    array2[index + 1] = temp
                    swapped = true
                    for (element in array2)  print("$element " )
                }
                index++


            }
        }
        print("\n Jumlah Swaps: $count")
    }
}