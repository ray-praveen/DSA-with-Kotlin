package DSA.arrays.basicArrayQuestion

import kotlin.math.min

//fun MinAndMax(arr: IntArray): Pair<Int, Int>{
//
//
//    var minElement = arr[0]
//    var maxElement = arr[0]
//
//    for (i in 1 until arr.size){
//
//        if (arr[i] > maxElement){
//            maxElement = arr[i]
//        }else if (arr[i] < minElement){
//            minElement = arr[i]
//        }
//
//    }
//
//    return Pair(minElement, maxElement)
//
//}


// Sorting

fun BySorting(arr:IntArray): Pair<Int, Int>{

    arr.sort()

    val minElement = arr[0]
    val maxElement = arr[arr.size - 1]

    return Pair(minElement, maxElement)

}


fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    val (min, max) = BySorting(arr)
    println("Min: ${min}, Max: ${max}")

}