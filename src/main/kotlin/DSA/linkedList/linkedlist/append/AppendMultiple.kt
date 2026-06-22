package DSA.linkedList.linkedlist.append

data class Node2<T>(
    var value: T,
    var next: Node2<T>?= null
){

    override fun toString(): String {
        return if (next != null){
            "$value -> $next"
        }else{
            "$value"
        }
    }

}

class AppendMultiple<T>{

    private var head: Node2<T>? = null
    private var tail: Node2<T>? = null
    private var size = 0

    fun isEmpty() = size == 0

    fun push(value:T){
        head = Node2(value, head)

        if (tail == null){
            tail = head
        }
        size++
    }

    fun append(value: T){

        if(isEmpty()){
            push(value)
        }

        tail?.next = Node2(value)

        tail = tail?.next

        size++

    }

    override fun toString(): String {
        return head?.toString() ?: "Empty List"
    }


}

fun main(){

    val list = AppendMultiple<Int>()
    list.append(1)
    list.append(2)
    list.append(3)

    println(list)

}