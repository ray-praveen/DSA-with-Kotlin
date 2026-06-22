package DSA.linkedList.linkedlist.push

// FInd Head After Push

data class Node4<T>(
    var value: T,
    var next: Node4<T>? = null
)

class FindHead<T>{

    private var head: Node4<T>? = null
    private var tail: Node4<T>? = null

    fun push(value: T){
        head = Node4(value, head)

        if (tail==null){
            tail = head
        }

    }

    override fun toString(): String {
        return head?.toString() ?: "Empty"
    }

    fun headValue(): T?{
        return head?.value
    }

}

fun main(){
    var list = FindHead<Int>()
    list.push(10)
    list.push(20)
    list.push(30)


    println(list.headValue())

}