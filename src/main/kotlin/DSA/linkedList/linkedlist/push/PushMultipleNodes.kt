package DSA.linkedList.linkedlist.push

data class Node3<T>(
    var value: T,
    var next : Node3<T>? = null
)

class PushMultipleNodes<T>{

    private var head : Node3<T>? = null
    private var tail : Node3<T>? = null
    private var size = 0

    fun push(value: T){
        head = Node3(value, head)

        if (tail == null){
            tail = head
        }
    }

    override fun toString(): String {
        return head?.toString() ?: "Empty"
    }

}

fun main(){

    var list = PushMultipleNodes<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println(list)

}