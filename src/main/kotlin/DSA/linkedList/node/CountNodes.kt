package DSA.linkedList.node


data class Node<T>(
    var value: T, var next: Node<T>? = null
)

fun CountNode( head: Node<Int>?): Int{

    var currentNode = head
    var count = 0

    while (currentNode != null){
        count++
        currentNode = currentNode.next
    }
    return count
}

fun main(){

    var node1 = Node(1)
    var node2 = Node(2)
    var node3 = Node(3)
    var node4 = Node(4)

    node1.next = node2
    node2.next = node3
    node3.next = node4

    println(CountNode(node1))

}