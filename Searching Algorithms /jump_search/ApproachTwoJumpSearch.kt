package jump_search

// this is also my own practice i have'nt looked at the actual code for jump search at this point
fun main() {

    val searchValue  = 40
    val numberArray  = arrayOf(10, 20, 40, 50, 80, 100, 300, 350, 400, 456, 500)
    val found: Boolean  = jumpSearchApproachTwo(searchValue, numberArray)

    if (found) println("value: $searchValue is present")
    else println("value: $searchValue is not present !")

}

private fun jumpSearchApproachTwo(value: Int, array: Array<Int>): Boolean {

    val m = 4 // size of block.
    val n = array.size -1 // size of array.

    var i = 0
    while((i+1)*m < n) {

        if(value < array[(i+1)*m]){ // checking if the value is smaller then value at array[(i+1)*m]
            for (index in (i*m) until (i+1)*m ) {
                if(value == array[index]) return true // performing linear search in that block where our value is smaller then value at (i+1)*m
            }
            return false // if we get outside the loop without returning true which means value is not present because array is sorted and this was the only block that may have that value.
        }
        i++
    }

    // if (i+1)* m becomes more then or equal to n then we are going to perform linear search from last end point (i*m) to last index (n)
    for (index in (i*m)..n ){
        if(value == array[index]) return true
    }

    return false

}