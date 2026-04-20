package DSA.arrays.questionfromgfg

import kotlin.math.max

//Problem : Maximum index difference(j-1) such that arr[i] < arr[j]

// Problem statement: given an array arr:
// find max value of (j -1) : arr[i] < arr[j] AND i < j

// Problem Understanding: 1. first we can find max distance (j-1)
// then check condition: if left value < right value
// Direct brute force: in every check -> O(n2) not acceptable)

// Approach:
//1. create 2 auxiliary Array: leftMin[], RightMax[]
//2. if leftMin[i] < RightMax[j] then valid pair exist
// 3. by Two pointer

// Code:

fun MaxIndexDiff(arr: IntArray) : Int{

    val n = arr.size

    // Left Min array
    val leftMin = IntArray(n)
    leftMin[0] = arr[0]

    for (i in 0 until n){
        leftMin[i] = minOf(arr[i], leftMin[i - 1])
    }

    // Right Max array
    val RightMax = IntArray(n)

    RightMax[n - 1] = arr[n -1]
    for (j in n - 2 downTo 0){
        RightMax[j] = maxOf(arr[j], RightMax[j + 1])
    }

    // Two Pointer

    var i = 0
    var j = 0
    var maxDiff = 0

    while (i < n && j < n){
        if(leftMin[i] < RightMax[j]){
            maxDiff = maxOf(maxDiff, j - i)
            j++
        }else{
            i++
        }
    }

    return maxDiff

}

fun main(){

    val n = readLine()!!.toInt()

    val arr = IntArray(n)

    for(i in 0 until n){
        arr[i] = readLine()!!.toInt()
    }

    val result = MaxIndexDiff(arr)
    println(result)


}


// Time Complexity: O(n)
// Space Complexity: O(n)