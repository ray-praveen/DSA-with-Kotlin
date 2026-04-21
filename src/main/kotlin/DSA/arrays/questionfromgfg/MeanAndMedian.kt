package DSA.arrays.questionfromgfg

// Problem Name: Find mean and Median of an Array

// Problem Statement: Given an arr[] of +ve integers
// Mean -> average of all elements
// Median -> middle value after sorting

// Approach Clarity
// Step 1: Mean: calculate the sum in a loop / n
// Step 2: Median: Normally sorting then use quickSelect

fun MeanAndMedian(arr:IntArray): Pair<Int, Int> {

    val n = arr.size

    var sum = 0L

    for(num in arr){
        sum += num
    }

    val mean = (sum / n).toInt()

    val copy = arr.copyOf()

    val median = if( n %2==1){
        QuickSort(copy, 0, n - 1, n / 2)
    }else{
        val left = QuickSort(copy, 0, n - 1, n / 2 - 1)
        val right = QuickSort(copy, 0, n - 1, n / 2)
        (left + right) / 2
    }

    return Pair(mean, median)

}

fun QuickSort(arr:IntArray, left: Int, right: Int, k:Int) :Int{

    var l = left
    var r = right

    while (l <= r){

        val pivot = arr[r]
        var pIndex = l

        for(i in l until r){
            if (arr[i] < pivot){
                val temp = arr[i]
                arr[i] = arr[pIndex]
                arr[pIndex] = temp
                pIndex++
            }
        }

        val temp = arr[pIndex]
        arr[pIndex] = arr[r]
        arr[r] = temp

        if(pIndex == k) return arr[pIndex]
        else if(pIndex < k) l = pIndex + 1
        else r = pIndex -1


    }

    return -1

}

fun main(){

    val n = readLine()!!.toInt()

    val arr = IntArray(n)

    for ( i in 0 until  n){
        arr[i] = readLine()!!.toInt()
    }

    val (mean ,median) = MeanAndMedian(arr)

    println("Mean: $mean")
    println("Median: $median")
}