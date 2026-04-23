package DSA.arrays.questionfromgfg

// Problem Name: Check if Array is Sorted and Roted(counter-Clockwise)

// Problem Statement: Given an arr[] of +ve and distinct integers
// 1. Sorted (either increasing or Decreasing)
// 2. AND rotated at least once (counter-clockwise)

// Approach Clarity:
// Step 1. Count Violations
// step 2. Circular Check

// Code:

fun CheckisSortedAndRotated(arr: IntArray): Boolean {
    val n = arr.size
    if (n < 2) return false

    var incBreaks = 0
    var decBreaks = 0

    for (i in 0 until n - 1) {
        if (arr[i] > arr[i + 1]) incBreaks++
        if (arr[i] < arr[i + 1]) decBreaks++
    }

    if (arr[n - 1] > arr[0]) incBreaks++
    if (arr[n - 1] < arr[0]) decBreaks++

   if(incBreaks == 1 && decBreaks != 0) return true
   if(decBreaks == 1 && incBreaks != 0) return true

    return false
}

fun main() {
    val n = readLine()!!.toInt()

    val arr = IntArray(n)

    for (i in 0 until n) {
        arr[i] = readLine()!!.toInt()
    }

    val result = CheckisSortedAndRotated(arr)
    println("Is sorted and rotated: $result")
}


// Time Complexity: O(n)
// Space Complexity: O(1)