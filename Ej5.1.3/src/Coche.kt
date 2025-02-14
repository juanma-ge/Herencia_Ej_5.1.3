import kotlin.math.abs

class Coche: EncendidoApagado, DispositivoElectronico, Vehiculo {

    override var motorEncendido: Boolean = false
    override var kmHora: Int = 0


    override fun encender() {
        if (!motorEncendido) {
            motorEncendido = true
            println("Coche encendido.")
        }else{
            println("El coche ya está encendido.")
        }
    }

    override fun apagar() {
        if (motorEncendido) {
            motorEncendido = false
            println("Coche apagado.")
            if (kmHora < 0){
                kmHora = 0
            }
        }else{
            println("El coche ya está apagado.")
        }
    }

    override fun reiniciar() {
        if (motorEncendido) {
            apagar()
            encender()
            println("El coche se está reiniciando...")
        }else{
            println("El coche no puede reiniciarse si está apagado.")
        }
    }

    override fun acelerar(incremento: Int) {
        if (motorEncendido) {
            kmHora += incremento
            println("El coche ha acelerado $incremento Kmhora.")
        }else{
            println("El coche no puede acelerar si está apagado..")
        }
    }

    override fun frenar(decremento: Int) {
        if (motorEncendido) {
            kmHora -= decremento
            println("El coche ha decelerado $decremento Kmhora.")
        } else {
            println("El coche no puede frenar si está apagado.")
        }
    }
}