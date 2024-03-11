fun main(){
    for(x in 1..9){
        if(( x>2 ||x < 6) && ( x>4 || x<7 )) print("A")
        if(( x>4 && x<6 )||(x in 5..6))print("B")
    }
    //ManuelM
}
//fun main(){
//   var matriz1= arrayOf(9,1,3,5)
//   var matriz2=matriz1
//   matriz2[3]=4
//   matriz1[1]=3
//    metodo(matriz1,matriz2)
//    println(matriz1[1])
//    println(matriz2[2])
//
//
//}
//fun metodo(m1:Array<Int>, m2:Array<Int>){
//    m1[1]=4
//    m2[1]=m1[3]+m2[2]
//}