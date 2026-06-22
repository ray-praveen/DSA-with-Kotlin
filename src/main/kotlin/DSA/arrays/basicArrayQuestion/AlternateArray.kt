package DSA.arrays.basicArrayQuestion

// Alternates in Array

// Brute-forces
fun AlternateArrayBrute(arr:IntArray): List<Int>{

    val result = mutableListOf<Int>()

    for (i in arr.indices){
        if (i % 2 == 0){
            result.add(arr[i])
        }
    }

    return result

}

// Naive Method Code

fun AlternateArrayNaive(arr: IntArray): List<Int>{

    val result = mutableListOf<Int>()

    for (i in 0 until arr.size step 2){
        result.add(arr[i])
    }

    return result

}

// optimized code

fun AlternateArray(arr:IntArray):List<Int>{

    val result = mutableListOf<Int>()

    var i = 0
    while (i < arr.size){
        result.add(arr[i])
        i += 2
    }
    return result

}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()
    println(AlternateArrayBrute(arr))
}