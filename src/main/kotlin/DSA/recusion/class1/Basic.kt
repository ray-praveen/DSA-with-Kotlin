package DSA.recusion.class1

fun BasicOfRecusion(n:Int){

    if(n==0){
        return
    }

    BasicOfRecusion(n-1)
    println(n)
}

fun main(){
    val n = readln()!!.toInt()

    BasicOfRecusion(n)
}