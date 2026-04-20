package DSA.arrays.questionfromgfg

// Problem Name: Insert Element in End of Array

// problem statement: given an array arr, val value
// Insert val at the end of the array and return updated array

//Approach: 1. create new array with n+1 size
// 2. copy with original array
// 3. insert val in last index


fun insertElementInLast(arr: IntArray, value: Int): IntArray{

    val n = arr.size

    val result = IntArray(n+1)

    for(i in 0 until n){
        result[i] = arr[i]    // copy original elements
    }

    result[n] = value   // insert at end

    return result
}

fun main(){

    val n= readLine()!!.toInt()

    val arr = IntArray(n)

    for(i in 0 until n){
        arr[i] = readLine()!!.toInt()
    }

    val value = readLine()!!.toInt()

    val result = insertElementInLast(arr, value)

    println(result.joinToString (" "))

}


// Time Complexity: O(n)
//Space Complexity: O(n)  // create new array