package DSA.arrays.basicArrayQuestion

// Subset of Array

fun SubsetArray(arr1:IntArray, arr2: IntArray):Boolean{

    val freq = HashMap<Int, Int>()

    for(num in arr1){
        freq[num] = freq.getOrDefault(num , 0) + 1
    }

    for (num in arr2){
        val count = freq.getOrDefault(num, 0)

        if (count == 0){
            return false
        }

        freq[num] = count - 1

    }

    return true

}

fun main(){

    val arr1 = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    val arr2 = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    val result = SubsetArray(arr1, arr2)
    println("Is Subset ${result}")
}