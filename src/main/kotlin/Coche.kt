/**
 * Coche representa un vehiculo de tipo coche
 *
 * @constructor Create empty Coche
 * @author Manuel Muñoz
 */
class Coche:Vehiculo {
    var cilindrada:Int
    constructor(cilindrada: Int,kmRecorridos: Int):super(kmRecorridos){
        this.cilindrada=cilindrada
    }

    /**
     * Quemar rueda muestra un mensaje
     *
     */
    fun quemarRueda(){
        println("brummbrummmrbrumm ppapapapap")
    }

    override fun toString(): String {
        return "Coche(cilindrada=$cilindrada)"+super.toString()
    }

}