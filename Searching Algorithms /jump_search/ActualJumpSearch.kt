package jump_search
/**
 * Works only for sorted array
 * Optimal size of a block to be jumped is sqrt(n)
 * thus Time  complexity is  O(sqrt(n))
 *
 * */

fun jumpSearch(value: Int, array: Array<Int>): Boolean{

    // size of the array
    val n = array.size

    // block to be jumped...
    var step: Int = Math.floor(Math.sqrt(n.toDouble())).toInt()


    var prev = 0
    while(array[Math.min(step, n) -1] < value) { // if value at array[step -1] or  at array[n -1] is smaller then searched value then we have to increase the step and change the prev to previous step value

        prev = step // setting prev to previous step value
        step += step // increasing the step

        // if our step becomes greater or equal to  n, then we have run out index and our element is not present in the array
        if (prev >= n)  return false

    }


    // the  control reaches to this point because of two reasons
    // 1. value at array[step -1] > value
    // or 2. value at array[n - 1] > value

    // which means our searched value maybe present in block starting from prev(previous step)  to  step or n -1  so we have to perform a linear search from prev to step -1 or n -1
    while (array[prev] < value) {
        prev ++ // increasing prev by one because value is value at prev smaller then searched value

        if (prev == Math.min(step, n)) return false // if our prev becomes equal to sqrt or n means  we have checked all the elements from prev to step or n -1 and element is not present in the block and array
    }


    // the control reaches this point because of 2 reason again
    // 1. value at array[prev] is equal to the searched value (means element is present)
    // or 2. value at array[prev] is greater then searched value (means element is not present)

    if (array[prev] == value) return true

    return false // finally value is not present because value at array[prev] is greater then searched value

}
