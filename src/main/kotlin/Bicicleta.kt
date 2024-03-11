/**
 * Bicicleta representa un vehiculo del tipo bicicleta
 *
 * @property piñones representa el numero de piñones de la bicicleta
 * @constructor
 *
 * @param kmRecorridos
 * @author Manuel Muñoz
 */
class Bicicleta(kmRecorridos:Int, var piñones:Int):Vehiculo(kmRecorridos) {
    /**
     * Hacer caballito muestra un mensaje
     *
     */
    fun hacerCaballito(){
        println("WIiiiiiiiiii caballito")
    }

    override fun toString(): String {
        return "Bicicleta(piñones=$piñones)"+super.toString()
    }

}