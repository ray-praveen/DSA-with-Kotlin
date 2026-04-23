package DSA.arrays.basicArrayQuestion

// largest in Array

fun LargestElementArray(arr:IntArray): Int{

    val n = arr.size

    var maxElement = arr[0]

    for(i in 1  until n){
        if(arr[i] > maxElement){
           maxElement =   arr[i]
        }
    }

    return maxElement
}
fun main(){

    val arr= readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    println(LargestElementArray(arr))

}