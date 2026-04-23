package DSA.arrays.basicArrayQuestion


// Brute force
//fun RotateArrbyOne(arr:IntArray): IntArray{
//
//    val n = arr.size
//    val result = IntArray(n)
//
//    result[0] = arr[n - 1]
//
//    for (i in 0 until n - 1){
//        result[i + 1]  = arr[i]
//    }
//
//    return result
//
//}


// Naive Approach
//fun rotateNaive(arr:IntArray){
//
//    val n = arr.size
//
//    val last = arr[n - 1]
//
//    for (i in n - 1 downTo 1){
//        arr[i] = arr[i - 1]
//    }
//    arr[0] = last
//
//}

// Optimized Code

fun rotateOptimized(arr:IntArray){

    val n = arr.size
    if (n <= 1) return

    val lastElement = arr[n - 1]

    for (i in n - 1 downTo 1){
        arr[i] = arr[i - 1]
    }

    arr[0] = lastElement
}

fun main(){
    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

     rotateOptimized(arr)

    println(arr.joinToString(" "))
}