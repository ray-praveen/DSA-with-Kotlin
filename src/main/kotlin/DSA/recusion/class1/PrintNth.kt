package DSA.recusion.class1

fun NamePrint(n:Int){

    if(n == 0)
        return

    NamePrint(n-1)
    println("Alex")

}

fun main(){

    val n = readLine()!!.toInt()

   NamePrint(n)

}