
// Problem: Insert Element at Given Index in Array

// Problem Statement: Insert val at the given index adn return the updated array!

// approach clarity:fixed array(IntArray) size not changed.
//that why we make new array with size n+1;

//Code:

fun main(){

    val arr = arrayListOf(1, 2, 3, 4, 5)

    val index = readLine()?.toIntOrNull()?: 0

    val value = readLine()?.toIntOrNull()?: 0

    val result = arr.add(index, value)

    println(result)

}