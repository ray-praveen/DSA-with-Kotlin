package DSA.recusion.class1

fun PowerRecursion(x: Int, n:Int):Int{

    if (n == 0)
        return 1

    if (n<0){
        return 1/ PowerRecursion(x, -n)
    }

    return x * PowerRecursion(x, n-1)

}

fun main(){

    val x = 2
    val n = 4

    println(PowerRecursion(x, n))

}