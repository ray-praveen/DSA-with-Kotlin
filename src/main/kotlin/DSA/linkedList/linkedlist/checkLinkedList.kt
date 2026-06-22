package DSA.linkedList.linkedlist

import DSA.linkedList.node.Node

data class Node<T>(
    var value: T,
    var next: Node<T>? = null
)

class linkedListEmpty<T>{

    private var head: Node<T>? =null
    private var tail:Node<T>?= null
    private var size = 0

    fun isEmpty(): Boolean{
        return size == 0
    }


}

fun main(){

    val list = linkedListEmpty<Int>()

    println(list.isEmpty())

}

// TC: O(1), SC: O(1)