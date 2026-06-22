package DSA.linkedList.linkedlist.append

// Append Single Node

data class Node<T>(
    var value: T,
    var next: Node<T>? = null
){
    override fun toString(): String {
         return if (next != null){
             "$value -> $next"
        }else{
            "$value"
         }
    }
}

class AppendSingleNode<T>{

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty() = size ==0

    fun push(value: T){

        head = Node(value, head)

        if (tail == null){
            tail = head
        }

        size++

    }

    fun appendNode(value:T){
        if (isEmpty()){
            push(value)
            return
        }

        tail?.next = Node(value)

        tail = tail?.next
        size++
    }

    override fun toString(): String {
        return head?.toString() ?: "Empty List"
    }

}

fun main(){

    val list = AppendSingleNode<Int>()
    list.appendNode(4)

    println(list)

}