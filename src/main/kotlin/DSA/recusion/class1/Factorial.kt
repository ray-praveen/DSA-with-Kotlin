package DSA.recusion.class1

fun factorial(n:Int):Int{

    if (n==1){
        return 1
    }

    return n * factorial(n-1)

}

fun main(){
    val n = 5
    println(factorial(n))
}