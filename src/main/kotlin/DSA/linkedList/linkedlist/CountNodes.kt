package DSA.linkedList.linkedlist


data class Node5<T>(
    var value: T,
    var next : Node5<T>? =null
)

class CountNodesAP<T>{

    private var head : Node5<T>? = null
    private var tail : Node5<T>? = null

    fun push(value: T){
        head = Node5(value, head)

        if (tail == null){
            tail = head
        }
    }

    override fun toString(): String {
        return head?.toString() ?: "Empty"
    }

    fun countNodes(): Int{

        var currentNode = head
        var count = 0

        while (currentNode != null){
            count++
            currentNode = currentNode.next
        }
        return count


    }


}

fun main(){

    var list = CountNodesAP<Int>()
    list.push(10)
    list.push(20)
    list.push(30)
    list.push(40)
    println(list.countNodes())

}
