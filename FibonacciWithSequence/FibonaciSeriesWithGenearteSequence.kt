

fun main() {

    val fibonacciSequence = fibonacciSeries()
   println(fibonacciSequence.take(20).toList())

}

fun fibonacciSeries(): Sequence<Int>{
    // seed provides the initial value and nextFunction()  is called upon the seed
    return generateSequence(Pair(0,1)) { Pair(it.second, it.first + it.second) } //  returning the new pair and calling nextFunction upon it
            .map{it.first} //returning  first element from pair before again calling the nextFunction which is invoked by Iterator.next()

}