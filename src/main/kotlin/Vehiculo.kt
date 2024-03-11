/**
 * Vehiculo
 *
 * Clase para representar un vehiculo generico
 * @property kmRecorridos
 * @constructor Create empty Vehiculo
 * @author Manuel Muñoz
 */
open class Vehiculo(var kmRecorridos:Int) {
    /**
     * Recorre permite hacer que el vehiculo recorra mas kilometros
     *
     * @param km los kilometros que recorre el vehiculo
     */
    fun recorre(km:Int){
        println("recorre $km")
        kmRecorridos+=km
    }

    override fun toString(): String {
        return "Vehiculo(kmRecorridos=$kmRecorridos)"
    }

}