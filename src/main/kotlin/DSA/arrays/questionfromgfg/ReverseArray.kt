package DSA.arrays.questionfromgfg

import kotlin.math.min

// Problem Array in Groups of Size K

// Problem Statement: Given an arr[] of +ve integers and integer k
// Reverse the array in groups of k.
// if in last group element < k -> then reverse it

// Approach Clarity
// Core Idea -> Two pointer per Group

// code:

fun  ReverseArray(arr:IntArray, k :Int ){
    val n = arr.size

    var i = 0
    while (i < n){

        var left = i
        var right = min(i + k -1, n - 1)

        while (left < right){
            val temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp

            left++
            right--
        }

        i +=  k


    }

}

fun main(){

    val n = readLine()!!.toInt()

    val arr = IntArray(n)

    for(i in 0 until n){
        arr[i] = readLine()!!.toInt()
    }
    val k = readLine()!!.toInt()

    ReverseArray(arr, k)
    println(arr.joinToString(" "))
}

// Time Complexity = O(n)
// Space Complexity = O(1)