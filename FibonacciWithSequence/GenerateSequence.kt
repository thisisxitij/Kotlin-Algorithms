
var i: Int= 10
val numberSequence: Sequence<Int> = generateSequence{
    // requires nextFunction as parameter which returns the next value
    // under the hood which is invoked  by Iterator.next() of sequence class
    i--.takeIf{i >= 0}

}

fun main(){
    println(numberSequence.toList())
}