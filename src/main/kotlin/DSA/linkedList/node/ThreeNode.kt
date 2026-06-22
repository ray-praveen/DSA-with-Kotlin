package DSA.linkedList.node


data class ThreeNode<T>(
    var value: T, var next: ThreeNode<T>? = null
){
    override fun toString(): String {
        return if (next != null){
            "$value -> ${next.toString()}"
        }else{
            "$value"
        }
    }
}

fun main(){

    var node1 = ThreeNode(value = 1)
    var node2 = ThreeNode(value = 2)
    var node3 = ThreeNode(value = 3)

    node1.next = node2
    node2.next = node3

    println(node1)

}