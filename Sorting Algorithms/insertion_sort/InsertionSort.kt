package insertion_sort


fun main() {
    val unsortedArray = arrayOf(10, 4, 5, 12, 3, 4, 0, 9, 1)
    println(unsortedArray.toList())
    insertionSort(unsortedArray)
    println(unsortedArray.toList())
}


fun insertionSort(array: Array<Int>) {

    val n  = array.size  -1 // last index of array.
    // we check for  elements from 1st to nth index  with all the previous elements (predecessor)
    for(i in 1..n) {
        val key = array[i] // element we want to compare or check with previous elements

        // for comparing elements with our key value( value that we want to place in right place )
        var j = i -1
        while( j >= 0 && key < array[j]) {
            // making room for our for our key value which is smaller then value at j ( shifting elements to right by one)
            array[j+1] = array[j]
            j--
        }

        // we reach at this point only if the there is no previous elements to check our key value with.
        // or if there is some smaller element then our key value in previous elements
        // so at this point we have shifted enough elements to place our key value at correct place
        // which will be at one index greater then the smaller value's index or at 0th index if our key value was smallest then its all previous elements.
        array[j+1] = key

    }



}