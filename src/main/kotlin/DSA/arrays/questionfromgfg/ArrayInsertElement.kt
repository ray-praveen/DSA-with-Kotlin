package DSA.arrays.questionfromgfg


// Problem: Insert Element at Given Index in Array

// Problem Statement: Insert val at the given index adn return the updated array!

// approach clarity:fixed array(IntArray) size not changed.
//that why we make new array with size n+1;

//Code:

fun insertAtIndex(arr: IntArray, index: Int, value: Int): IntArray{

    val n = arr.size

    val result = IntArray(n + 1)   // create new array of size n+1

    for(i in 0 until index){
        result[i] = arr[i]  // copy element
    }

    result[index] = value   // insert new value

    for (i in index until  n){
        result[i + 1] = value  // shift remaining elements
    }

    return result

}

fun main() {
    println("Enter size of array:")
    val n = readLine()!!.toInt()

    val arr = IntArray(n)

    println("Enter elements:")
    for (i in 0 until n) {
        arr[i] = readLine()!!.toInt()
    }

    println("Enter index:")
    val index = readLine()!!.toInt()

    println("Enter value to insert:")
    val value = readLine()!!.toInt()

    val result = insertAtIndex(arr, index, value)

    println("Updated array:")
    println(result.joinToString(" "))
}

//Time Complexity: O(n)
//Space Complexity: O(n) // due to array size n+1
