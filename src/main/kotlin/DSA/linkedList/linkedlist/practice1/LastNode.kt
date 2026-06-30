package DSA.linkedList.linkedlist.practice1

import DSA.linkedList.linkedlist.append.Node4
import DSA.linkedList.linkedlist.insert.Node2

data class Node<T>(
    var value : T,
    var next : Node<T>?= null
){
    override fun toString(): String {
        return if (next != null){
            "$value -> $next"
        }else{
            "$value"
        }
    }
}

class LastNode<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty() = size == 0

    fun push(value: T) {
        head = Node(value, head)
        if (tail == null) {
            tail = head
        }
        size++
    }

    fun append(value: T) {

        if (isEmpty()) {
            push(value)
            return
        }

        tail?.next = Node(value)
        tail = tail?.next

        size++
    }

    fun nodeAT(index: Int): Node<T>? {
        var currentNode = head
        var currrentIndex = 0

        while (currentNode != null && currrentIndex < index) {
            currentNode = currentNode.next
            currrentIndex++
        }
        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>): Node<T>{
        if (tail == afterNode){
            append(value)
            return tail!!
        }

        val newNode = Node(value, afterNode.next)

        afterNode.next = newNode

        size++

        return newNode
    }

    override fun toString(): String {
        return head?.toString() ?: "Empty List"
    }

    fun lastUsingNodeAt(): T?{
        if (isEmpty()){
            return null
        }

        return nodeAT(size-1)?.value
    }
}


fun main(){

    val list = LastNode<Int>()
    list.append(10)
    list.append(20)
    list.append(30)
    list.append(40)

    println(list.lastUsingNodeAt())

}