package DSA.recusion.class1

fun FibonacciSeries(n:Int):Int{

    if(n==0 || n==1){
        return n
    }

    return FibonacciSeries(n-1) + FibonacciSeries(n-2)

}

fun main(){
    val n = 8
    println(FibonacciSeries(n))
}