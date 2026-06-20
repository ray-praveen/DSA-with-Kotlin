package DSA.linkedList

data class Node<T>(var value: T, var next: Node<T>? = null){
    override fun toString(): String {
        return if (next != null){
            "$value -> ${next.toString()}"
        }else{
            "$value"
        }
    }
}

fun main(){

   var node1 = Node(value = 1)
   var node2 = Node(value = 2)
   var node3 = Node(value = 3)

    node1.next = node2
    node2.next = node3

    println(node1)

}