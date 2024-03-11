/**
 * Main genera un menu con el que puedes hacer manipular los vehiculos
 *
 *
 */
fun main(){
    var coche=Coche(6,0)
    var bicicleta=Bicicleta(0,7)
    do {
        println("VEHICULO")
        println("===========")
        println("""
        1. Anda con la bicicleta
        2. Haz el caballito con la bicicleta
        3. Anda con el coche
        4. Quema rueda con el coche
        5. Ver kilometraje de la bicicleta
        6. Ver kilometraje del coche
        7. Salir
        Elige una opción (1-7):
    """.trimIndent())
        var opcion= readln().toInt()
        when (opcion){
            1->{
                println("cuanto anda?")
                var avance= readln().toInt()
                bicicleta.recorre(avance)
            }
            2->bicicleta.hacerCaballito()
            3->{
                println("cuanto anda?")
                var avance= readln().toInt()
                coche.recorre(avance)
            }
            4->coche.quemarRueda()
            5-> println(bicicleta.kmRecorridos)
            6-> println(coche.kmRecorridos)
            7-> println("Hasta Pronto")
        }

    }while (opcion !=7)



}