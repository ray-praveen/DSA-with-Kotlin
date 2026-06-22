package DSA.arrays.basicArrayQuestion

// Value equal to position

//Brute-force Code
fun ValueEqtoPosBrute(arr:IntArray):List<Int>{

    val result = mutableListOf<Int>()

    for (i in arr.indices){
        for(j in 1..arr.size){
            if(i+1 == j && arr[i] == j){
                result.add(j)
            }
        }
    }

   return result

}


// Naive Method Code:

fun ValueEqtoPosNaive(arr:IntArray): List<Int>{

    val result = mutableListOf<Int>()

    for (i in arr.indices){
        if (arr[i] == i + 1){
            result.add(i + 1)
        }
    }
    return result

}

// Optimized Code

fun ValueEqtoPos(arr:IntArray): List<Int>{

    val result = mutableListOf<Int>()

    for (i in arr.indices){
        if (arr[i] == i + 1){
            result.add(i+1)
        }
    }

    return result

}

fun main(){
    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    val result = ValueEqtoPosNaive(arr)
    println(result.joinToString(" "))
}
