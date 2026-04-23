package DSA.arrays.questionfromgfg

// Problem Name: Rearrange Array so that arr[i] becomes arr[arr[i]] (in-place)

// Problem Statement: Given arr[] of size n
// Task: Rearrange array = arr[i] = arr[arr[i]]

// Approach Clarity
// Step 1: Encode:
// Step 2: Decode


// code:

fun rearrangeArray(arr:IntArray){
    val n = arr.size

    for(i in 0 until  n){
        val newValue = arr[arr[i]] % n
        arr[i] = arr[i] + newValue * n
    }

    for( i in 0 until n){
        arr[i] = arr[i] / n
    }
}

fun main(){
    val n = readLine()!!.toInt()

    val arr = IntArray(n)

    for (i in 0 until n) {
        arr[i] = readLine()!!.toInt()
    }

    rearrangeArray(arr)

    println("Transformed array:")
    println(arr.joinToString(" "))
}