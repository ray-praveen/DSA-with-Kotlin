package DSA.recusion.class1

import DSA.arrays.kadaneAlgo.maxSum


fun Sum1toN(n:Int):Int{

    if(n==0){
        return 0
    }

   return n + Sum1toN(n-1)

}

fun main(){
    val n = 10
    println(Sum1toN(n))
}