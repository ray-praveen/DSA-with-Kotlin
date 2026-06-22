package DSA.arrays.kadaneAlgo

// Sub-array with max sum

fun maxSum(arr:IntArray): Int{

    var maxsum = arr[0]

//    for (value in arr){
//        maxsum += value
//    }

    for (i in arr.indices){
        if (arr[i] > maxsum){
            maxsum = arr[i]
        }
    }




    return maxsum

}

fun main(){

   val arr= readLine()!!
       .trim()
       .split(" ")
       .map { it.toInt() }
       .toIntArray()


    println( maxSum(arr))

}