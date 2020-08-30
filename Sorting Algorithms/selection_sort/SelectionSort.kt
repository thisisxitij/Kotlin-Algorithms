package selection_sort
// lets implement actual selection sort

/**Time complexity O(n^2)*/

fun main () {
    // with while loop
    val numbersArrayOne: Array<Int>  = arrayOf(90, 56, 100, 40, 60, 1, 20)
    selectionSortWithWhileLoop(numbersArrayOne)
    println(numbersArrayOne.joinToString(", ", "[", "]"))


    // with for loop
    val numbersArrayTwo = arrayOf(90, 30, 2, 100, 500, 23, 56)
    selectionSortWithForLoop(numbersArrayTwo)
    println(numbersArrayTwo.joinToString(", ", "[", "]"))

}

// Selection sort with while loop
fun selectionSortWithWhileLoop(array: Array<Int>){

    val n = array.size -1 // last index

    var i = 0
    while(i < n) { // comparing element from 0 to n -1 to the elements right of it
                    // (not from 0 to n because there is no elements we can compare to the right of the element at n
        var indexOfMinimumValue = i // supposing the minimum element at index i first

        // for traversing the array from (i+1 to n) for comparison with element at indexOfMinimumValue
        var j = i + 1
        while(j <= n) {
            if (array[indexOfMinimumValue] > array[j]) indexOfMinimumValue = j // updating minimum value index
            j++
        }

        // placing the minimum value at i
        val temp = array[i]
        array[i] = array[indexOfMinimumValue]
        array[indexOfMinimumValue] = temp

         i++
    }

}

// selection Sort with For Loop

fun selectionSortWithForLoop(array: Array<Int>){
    val n = array.size -1

    for(i in 0 until n) {
        var minIndex  = i

        // finding minimum value index
        for (j in i+1..n) {
            if (array[minIndex]> array[j]) minIndex = j
        }

        // swapping the  minimum value at minimum index  with the value at index i
        val temp = array[i]
        array[i] = array[minIndex]
        array[minIndex] = temp
    }
}