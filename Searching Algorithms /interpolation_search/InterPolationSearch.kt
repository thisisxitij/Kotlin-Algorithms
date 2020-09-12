package interpolation_search

fun main() {

    val testArray: Array<Int> = arrayOf(10, 20,  32, 45, 51, 62, 78 ,89)

    val found: Boolean= interpolationSearch(10, testArray)

    println("value ${if(!found) "not found !" else "found !"}")

}
/** Interpolation search is improvement over binary search*/
fun interpolationSearch(value: Int, array: Array<Int>): Boolean{

    var lo = 0
    var hi = array.size -1

    while(lo <= hi && value in array[lo] .. array[hi] ) {

        if (lo == hi) { // if lower bond becomes equal to the higher bond
            if (array[lo] == value)  return true
            return false
        }

        // if the searched value is closer to the last element pos(index) is going to be closer to the last index of array
        // or if the value is closer to the first element of the array pos(index) is going to be closer to first index.
        // or interpolation search start searching for the element closer towards the end size or toward the start size
        // probing the position with keeping uniform distribution in mind.
        val pos = lo + ( (value -array[lo]) * (hi-lo)/ (array[hi]-array[lo]) )


        // rest of algo is same as binary search but instead of looking for element at mid point  we look at pos (index got using probe formula)
        if (array[pos] == value ) return true
        else if (value > array[pos]) lo = pos + 1 // increasing the lower bond
        else hi = pos -1

    }

    return false

}