package DSA.linkedList.linkedlist

import kotlin.math.truncate


data class Node6<T>(
    var value: T,
    var next: Node6<T>? = null
)
class SearchValue<T> {

    private var head : Node6<T>? = null
    private var tail : Node6<T>? = null

    fun push(value: T){
        head = Node6(value, head)

        if (tail == null){
            tail = head
        }
    }

    override fun toString(): String {
        return head?.toString() ?: "Empty"
    }

    fun searchValue(value: T): Boolean{

        var current = head

        while (current != null){
            if(current.value == value){
                return true
            }
            current = current.next
        }
        return false

    }

}

fun main(){

    val list = SearchValue<Int>()
    list.push(10)
    list.push(20)
    list.push(30)
    list.push(40)

    println(list.searchValue(value = 25))
}