class Telefono: EncendidoApagado, DispositivoElectronico {

    var encendido: Boolean = false

    override fun encender() {
        if (!encendido) {
            encendido = true
            println("Teléfono encendido.")
        }else{
            println("El teléfono ya está encendido.")
        }
    }

    override fun apagar() {
        if (encendido) {
            encendido = false
            println("Teléfono apagado.")
        }else{
            println("El teléfono ya está apagado.")
        }
    }

    override fun reiniciar() {
        if (encendido) {
            apagar()
            encender()
            println("El teléfono se está reiniciando...")
        }else{
            println("El teléfono no puede reiniciarse si está apagado.")
        }
    }

}