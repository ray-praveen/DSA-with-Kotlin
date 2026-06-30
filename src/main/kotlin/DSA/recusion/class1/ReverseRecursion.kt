package DSA.recusion.class1

fun ReverseRecursion(n:Int){

    if(n==0){
        return
    }

    println(n)
    BasicOfRecusion(n-1)

}

fun main(){
    val n = readLine()!!.toInt()

    ReverseRecursion(n)
}