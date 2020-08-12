

fun main() {

    val fibonacciSequence = fibonacciSeries()
   println(fibonacciSequence.take(20).toList())

}

fun fibonacciSeries(): Sequence<Int>{
    return generateSequence(Pair(0,1)) { Pair(it.second, it.first + it.second) } // passing pair as seed  and changed the first element value to second and second to the sum fo first and second
            // when next is called again this new value pair will also be passed
            .map{it.first} //returning  first element from pair before again calling the nextFunction which is  invoked by Iterator.next()

}