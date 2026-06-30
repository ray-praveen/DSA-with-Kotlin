package DSA.recusion.gfg

fun JosephusProblem(n:Int, k:Int): Int{

    if(n==1){
        return 0
    }


    return  (JosephusProblem(n-1, k) +k ) % n

}

fun main(){

    val n= readLine()!!.toInt()
    val k = readLine()!!.toInt()

    println(JosephusProblem(n, k)+1)

}