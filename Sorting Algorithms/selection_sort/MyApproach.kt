package selection_sort

fun main() {

    // Before sorting
    val arrayOne: Array<Int> = arrayOf(10, 2, 50, 30, 20, 19, 40, 23)
    println("Unsorted Array: ${arrayOne.toList()}")


    // After sorting
    selectionSortWithWhile(arrayOne)
    println("Sorted Array: ${arrayOne.toList()}")

    println("==========================================")

    // Before sorting
    val arrayTwo = arrayOf(80, 70, 60, 40, 20, 10) // worst case scenario
    println("Unsorted Array: ${arrayTwo.toList()}")

    // After Sorting
    selectionSortWithFor(arrayTwo)
    println("Sorted Array: ${arrayTwo.toList()}")

}
/** Time complexity is O(n^2) :-(
 * if the input increases a lil but time for execution will increase tremendously*/

// implementing with while
fun selectionSortWithWhile(array: Array<Int>) {

    /**
     * Here n donates to last index of array
     * we check the element (in this case integer) present at 0th index with rest of the elements right of that element (i.e 1..n)
     * we check for : is there any element present at (from 1..n) that is smaller then the element at 0th index
     * and if a element is  smaller then element at 0th index  we will place that element at 0th index
     * and the element at 0th index  goes to the index of element that is smaller then it
     * and continue comparing and changing the position of smaller element to 0th index like above two lines until reach the end of the array
     * after comparing all the elements with element at index 0
     * we start comparing element at next index (1) to the rest of the elements right of it
     * we will compare elements up to  (n -1) th Index to the elements right of it
     * but note here n is the last index then why i am comparing only elements from 0 to (n-1)th index (second last element)
     * because our last element is present at nth index(last index of array) means it has no elements right of it to compare to
     * and it will be the largest element in our array.
     * huff that's all i can explain how it works
     */

    val n = array.size - 1 // last index

    // for selecting or comparing a particular index
    var i = 0 // starting from oth index

    while(i < n) { //  only from (0 to n-1 (second last index) )

        // for traversing array from (i+1 to n)
        // so that we can check compare or check element at index i to the rest of the element right of it (from i+1 to n)
        var j = i + 1
        while(j <= n) {

            if (array[i] > array[j]) {
                val temp = array[i] // to save present at array[i]

                // changing there position in array
                array[i] = array[j]
                array[j] = temp
            }
            j++ // to check with next element
        }

        i ++ // increasing i to compare the element at next index to rest of the elements right of it
    }

}

// implementing with for
fun selectionSortWithFor(array: Array<Int>) {
    // lets do this with for

    val n = array.size -1
    for (i in 0 until n) {

        for (j in i+1..n) {
            if (array[i] > array[j]) {
                val temp = array[i]

                array[i] = array[j]
                array[j] = temp
            }
        }
    }

    // that's it..
}