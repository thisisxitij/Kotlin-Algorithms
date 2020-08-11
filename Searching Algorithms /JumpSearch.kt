
 /** Note this is my own practice of implementing jump search and at this point i have'nt seen how to do it.
  * this is all im figuring out by my own how can i do it.
  * After implementing my own solution i will check out how to write it properly and compare my practice or version of algorithm to the orignal proper way to implement it.*/
fun main() {
        val searchValue = 500
        val array = arrayOf(1, 2, 40, 50, 60, 70, 80, 100, 400, 500, 600) // array must be sorted
        val found = jumpSearch(searchValue, array)
        println(found)


}

fun jumpSearch(value: Int, array: Array<Int>): Boolean{

    var i = 0
    val m = 4 // block size
    val n = array.size -1

    while( (i*m) <= n ) { // if we reach out of the array while creating block of m size then we will make last end point to nth index of array
        if (array[(i*m)] == value) { // to check the end points of and avoid skipping end points (0,m,1m...im)
            println("At index: ${i*m}")
            return true
        } // check the value on each end point of the block
        if((i + 1)*m <= n) { // checking if (i + 1)*m is greater then array size to avoid IndexOutOfBonds 
            if (array[i * m] < value && value < array[(i + 1) * m]) {// if found the interval or block in which our value maybe present

                for (index in i * m..(i + 1) * m) if (array[index] == value) {    // linear searching in the interval or block
                    println("At index $index")
                    return true
                }
                return false // if the value is not present in the particular block then its not in the array thus returning false
            }
        }

        ++i
    }

    if (i*m > n){ // if the block reaches out of the array size
        if (array[n] == value) {
            println("At index: $n")
            return true
        }
        if(array[(i -1)*m] < value && value < array[n]) { // then we will check from the last end point of block we had before to the nth index of array
            for (index in (i-1)*m until n) if (array[index] == value){
                println("At index: $index")
                return true
            }

        }
    }

return false
}