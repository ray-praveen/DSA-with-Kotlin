package DSA.recusion.class1


fun HelloNtimes(n:Int){

    if (n == 0){
        return
    }

    HelloNtimes(n-1)
    println("Hello")

}

fun main(){

    val n = readLine()!!.toInt()

    HelloNtimes(n)

}