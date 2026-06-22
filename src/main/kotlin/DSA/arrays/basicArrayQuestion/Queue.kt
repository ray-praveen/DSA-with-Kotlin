package DSA.arrays.basicArrayQuestion

// Implement Queue using Array

// Brute-Force code

class QueueBrute(val capacity: Int){

    private val arr = IntArray(capacity)
    private var size = 0

    fun enqueue(x:Int){
        if (size== capacity) return
            arr[size++] = x
    }

    fun dequeue(){
        if (size == 0) return

        for (i in 1 until size){
            arr[i - 1] = arr[i]
        }
        size--
    }

    fun getFront(): Int{
        return if (size == 0) -1 else arr[0]
    }

    fun getRear(): Int{
        return if (size ==0) -1 else arr[size -1]
    }

    fun isEmpty(): Boolean = size == 0

    fun isFull(): Boolean = size == capacity

}

// Naive Approach

class QueueNaive(val capacity: Int){

    private val arr = IntArray(capacity)
    private var front = 0
    private var rear = -1

    fun enqueue(x:Int){
        if (rear == capacity)return
        arr[++rear] = x
    }

    fun dequeue(){
        if (front >rear)return
        front++
    }

    fun getFront():Int{
        return if (front > rear) -1 else arr[front]
    }

    fun getRear(): Int{
        return if (front> rear) -1 else arr[rear]
    }

    fun isEmpty(): Boolean = front > rear

    fun isFull(): Boolean = rear == capacity-1

}


// optimized

class CircularQueue(val capacity: Int){

    private val arr = IntArray(capacity)
    private var front = 0
    private var size = 0

    fun enqueue(x:Int){
        if (isFull()) return

        val rear = (front + size) % capacity
        arr[rear] = x
        size++
    }

    fun dequeue(){
        if (isEmpty()) return
        front = (front + 1) % capacity
        size--
    }

    fun getFront():Int{
        if (isEmpty()) return -1
        val rear = (front + size -1) % capacity
        return arr[rear]
    }
    fun isEmpty(): Boolean = size == 0

    fun isFull(): Boolean = size == capacity


}