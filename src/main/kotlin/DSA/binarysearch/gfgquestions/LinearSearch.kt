package DSA.binarysearch.gfgquestions

// Problem Name: Linear Search - First Occurrence

// Problem Statement: given, arr[], integer x,
// we've to check element x is resent in array or not!!

// Problem Understanding
// Array is not Sorted
// we need a first Occurenece

//Approach
//1. traverse array left to right
//2. compare each element to x
//3. when we found the match then immediately return the index(first occurenece)

//Code:

fun firstOccurrence(arr:IntArray, x:Int):Int{

    for(i in  arr.indices){
        if(arr[i] == x){
            return i
        }
    }
    return  -1

}

fun main(){

    val n = readLine()!!.toInt()
    val arr = IntArray(n)
    val input = readLine()!!.split(" ")
    val x = readLine()!!.toInt()

    for(i in 0 until n){
        arr[i] = input[i].toInt()

    }
    println(firstOccurrence(arr, x))

}