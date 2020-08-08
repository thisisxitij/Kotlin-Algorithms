// lets create binary search in kotlin

fun main() {
    // array must be sorted other wise binary search not behave correctly
    val searchValue = 10
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val found: Boolean = search(searchValue, array)

    // printing the status
    if(found) println("$searchValue found in Array.")
    else println("$searchValue not found in Array.")


}


// Time complexity of binary search is O(log n)
fun search(value: Int, array: Array<Int>): Boolean {
    var lowerBond = 0
    var upperBond  = array.size - 1

    while (lowerBond <= upperBond) { // lower bond must be smaller or equal to upperBond so that they can't pass each other
        val midPoint = lowerBond + upperBond  / 2 // getting middle index of array where is lower bond is first index and upper Bond is last index Of array

        if(array[midPoint] == value) return true // checking the value on mid point

        // Sub setting array ( changing lower and upper bond
        else if(array[midPoint] < value ) lowerBond = midPoint + 1 // increasing lower bond to midpoint + 1
        else upperBond  = midPoint - 1 // decreasing upper bond to midPoint -1
    }

    return false // return false if the value is not present in the array

}