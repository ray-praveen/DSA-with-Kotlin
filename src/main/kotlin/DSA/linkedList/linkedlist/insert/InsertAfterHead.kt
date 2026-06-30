package DSA.linkedList.linkedlist.insert


data class Node2<T>(
    var value: T,
    var next: Node2<T>? = null
){
    override fun toString(): String {
        return if (next!=null){
            "$value -> $next"
        }else{
            "$value"
        }
    }
}

class InsertAfterHead<T>{

    private var head: Node2<T>? = null
    private var tail: Node2<T>? = null
    private var size = 0

    fun isEmpty() = size == 0

    fun push(value: T){
        head = Node2(value, head)

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

        tail?.next = Node2(value)
        tail = tail?.next
        size++
    }

    fun nodeAt(index: Int): Node2<T>?{

        var currentNode = head
        var currentIndexed= 0

        while (currentNode != null && currentIndexed < index){
            currentNode = currentNode.next
            currentIndexed++
        }
        return currentNode

    }

    fun insert(value: T, afterNode: Node2<T>): Node2<T>{

        if (tail == afterNode){
            append(value)
            return tail!!
        }

        val newNode =
            Node2(value, afterNode.next)

        afterNode.next = newNode

        size++

        return newNode



    }

    override fun toString(): String {
        return head?.toString() ?: "Empty List"
    }

    fun headValue(): T?{
        return head?.value
    }

}

fun main(){

    val list = InsertAfterHead<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    var middleNode = list.nodeAt(1)!!
    for (i in 1 ..3){
        list.headValue()
        middleNode = list.insert(-1 * i, middleNode)
    }
    println(list)

}