package DSA.arrays.questionfromgfg

// Problem Name: Find Max & Second Max (Distinct Elements)

// Problem Statement: Given array arr[] of +ve integers(duplicates allowed)
// 1. Find Max element, 2. Second Max distinct element

// Approach Clarity: 1. Solve in one traversal
// 2. Maintain two variables

// Code:
//
//fun MaxAndSecondMax(arr: IntArray): Pair<Int, Int>{
//
//    var firstMax = Int.MIN_VALUE
//    var secondMax = Int.MIN_VALUE
//
//    for(element in arr){
//        if(element > firstMax){
//            secondMax = firstMax
//            firstMax = element
//        }else if (element < firstMax && element > secondMax){
//            secondMax = element
//        }
//    }
//
//    if (secondMax == Int.MIN_VALUE){
//        secondMax = -1
//    }
//
//    return Pair(firstMax, secondMax)
//
//
//
//}
//fun main(){
//
//    val n = readLine()!!.toInt()
//
//    val arr = IntArray(n)
//
//    for(i in 0 until n){
//        arr[i] = readLine()!!.toInt()
//    }
//
//    val (max, secondMax) = MaxAndSecondMax(arr)
//
//    println("Max: $max")
//    println("Second Max: $secondMax")
//}

//Time Complexity = T(n) = n * O(1) = O(n)
//Space Complexity = O(1)