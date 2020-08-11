fun main(){
    val fibonacciSeries = getFibonacciSeriesList(10)
    println(fibonacciSeries)

}

fun getFibonacciSeriesList(to: Int = 2): List<Int> {

    var t: Int
    var a: Int = 0
    var b: Int = 1

    val fibonacciList: MutableList<Int> = mutableListOf(0, 1)

    for (i in 3..to){ // first two numbers are already present in the list and thus we need rest of them
        t = a
        a = b
        b += t
        fibonacciList.add(b)
    }

    return fibonacciList //returning list of fibonacci series

}


// in progress

//fun getFibNumber(n: Int): Int{
//    return if (n < 0) {
//        println("Wrong Number!")
//        0
//    }
//    else {
//         if (n == 0) 0
//        else if (n == 1) 1
//        else getFibNumber ((n - 1) + (n - 2))
//    }
//
//
//}
