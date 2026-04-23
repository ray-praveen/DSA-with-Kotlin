package DSA.arrays.basicArrayQuestion

import kotlin.math.sign

// ArraySearch

fun SearchArray(arr:IntArray, k : Int): Int{


    for(x in arr.indices){
        if(arr[x] == k){
            return x
        }
    }

    return -1

}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()
    val k = readLine()!!.toInt()

    val result= SearchArray(arr, k)

    println(result)

}