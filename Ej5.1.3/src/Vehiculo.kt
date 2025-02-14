interface Vehiculo {

    var motorEncendido: Boolean
    var kmHora: Int

    fun acelerar(incremento: Int)

    fun frenar(decremento: Int)

}