package DSA.recusion.class1

fun EvenNum(n:Int){

    if (n == 0){
        return
    }

    EvenNum(n-2)
    println(n)

}

fun main(){

    val n = 10

    EvenNum(n)

}