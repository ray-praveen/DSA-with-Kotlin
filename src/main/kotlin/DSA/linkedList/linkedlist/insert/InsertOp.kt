package DSA.linkedList.linkedlist.insert

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

class InsertOp<T>{

    private var head : Node<T>? = null
    private var tail : Node<T>? = null
    private var size = 0

    fun isEmpty() = size == 0

    fun push(value: T){

        head = Node(value, head)

        if(tail == null){
            tail = head
        }
        size++

    }

    fun append(value: T){

        if (isEmpty()){
            push(value)
        }

        tail?.next = Node(value)
        tail = tail?.next
        size++

    }

    fun nodeAt(index:Int): Node<T>?{

        var currentNode = head
        var currentIndex = 0

        while (currentNode != null &&
                currentIndex < index){

            currentNode = currentNode.next
            currentIndex++
        }

        return currentNode

    }

    fun insert(value: T, afterNode:Node<T>): Node<T>{

        if (tail == afterNode){
            append(value)
            return tail!!
        }

        val newNode =
            Node(value, afterNode.next)

        afterNode.next = newNode

        size++

        return newNode

    }

    override fun toString(): String {
        return head?.toString()?: "Empty List"
    }

}

fun main(){

    val list = InsertOp<Int>()
    list.push(3)
    list.push(2)
    list.push(1)
    var middleNode = list.nodeAt(1)!!
      for(i in 1..3){
       middleNode = list.insert(-1 * i, middleNode)
      }
    println(list)

}