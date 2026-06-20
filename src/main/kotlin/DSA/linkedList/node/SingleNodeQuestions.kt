package DSA.linkedList.node


data class SingleNode<T>(
    var value: T,
    var next: SingleNode<T>? = null
)

fun main(){
    val node = SingleNode(10)
    println(node.value)
}