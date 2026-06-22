package DSA.linkedList.linkedlist.append

// Find Tail Value

data class Node4<T>(
    var value: T,
    var next: Node4<T>? = null
){

    override fun toString(): String {
        return if (next != null){
            "$value -> $next"
        }else{
            "$value"
        }
    }

}

class FindTail<T>{

    private var head: Node4<T>? = null
    private var tail: Node4<T>? = null
    private var size = 0

    fun isEmpty() = size == 0

    fun push(value:T){

        head = Node4(value, head)

        if (tail == null){
            tail = head
        }
        size++

    }

    fun append(value: T){

        if (isEmpty()){
            push(value)
            return
        }

        tail?.next = Node4(value)
        tail = tail?.next

        size++

    }

    override fun toString(): String {
        return head?.toString() ?: "Empty List"
    }

    fun tailValue(): T?{
         return tail?.value
    }
}

fun main(){

    var list = FindTail<Int>()

    list.append(1)
    list.append(2)
    list.append(3)
    list.append(4)

    println(list.tailValue())


}

