package DSA.linkedList.linkedlist


data class Node2<T>(
    var value: T,
    var next: Node2<T>? = null
)

class PushSingleNode<T>{
    private var head: Node2<T>? = null
    private var tail: Node2<T>? = null

    fun push(value: T){
        head = Node2(value, head)

        if (tail == null){
            tail = head
        }
    }

    override fun toString(): String {
        return head?.toString() ?: "Empty List"
    }

}

fun main(){

    val list = PushSingleNode<Int>()
    list.push(10)

    println(list)

}