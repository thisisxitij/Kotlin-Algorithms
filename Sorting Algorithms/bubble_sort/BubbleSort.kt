package bubble_sort

fun main() {
    val arrayOne = arrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Unsorted Array One: ${arrayOne.toList()}")

    // sort array
    bubbleSortWithWhile(arrayOne)
    println("With while loop !")
    println("Sorted Array Two: ${arrayOne.toList()}")

}

// bubble sort with while loop
// best time complexity: O(n) -> when the array is already sorted
// worst time complexity: O(n^2) -> when the array is reverse sorted

fun bubbleSortWithWhile(array: Array<Int>) {

    val n = array.size -1 // last index of array
    var i = 0
    var swapped: Boolean // to check the array is already sorted

    while(i < n) {
        swapped = false

        // for traversing the array
        var j = 0
        while(j < n -i -1) { // because we know last value in array is already sorted after one iteration of outer while gets completed

            // swap the value at j  with value at j+1 if the value is greater at index j then the value at index j +1
            if (array[j] > array[j +1]) {
                val temp = array[j]
                array[j] = array[j +1]
                array[j +1] = temp

                // and the value is swapped means our array is not fully sorted yet
                swapped = true
            }
            j++
        }
        if(!swapped) break // array is sorted
        i++
    }
}

