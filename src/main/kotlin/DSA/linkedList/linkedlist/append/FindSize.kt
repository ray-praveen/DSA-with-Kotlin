package DSA.linkedList.linkedlist.append

data class Node3<T>(
    var value:T,
    var next: Node3<T>? = null
){
    override fun toString(): String {
        return if (next!= null){
            "$value -> $next"
        }else{
            "$value"
        }
    }
}

class FindSize<T>{

    private var head : Node3<T>? = null
    private var tail : Node3<T>? = null
    private var size = 0

    fun isEmpty() = size == 0

    fun push(value:T){

        head = Node3(value, head)

        if (tail == null){
            tail = head
        }
        size++

    }

    fun append(value:T){
        if (isEmpty()){
            push(value)
            return
        }

        tail?.next = Node3(value)

        tail = tail?.next

        size++
    }

    override fun toString(): String {
        return head?.toString() ?: "Empty List"
    }

    fun findSize(): Int{
        return size
    }

}

fun main(){

    var list = FindSize<Int>()
    list.append(1)
    list.append(2)
    list.append(3)

    println(list.findSize())

}