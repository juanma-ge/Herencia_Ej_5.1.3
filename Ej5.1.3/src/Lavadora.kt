class Lavadora: EncendidoApagado, DispositivoElectronico {

    var encendido: Boolean = false

    override fun encender() {
        if (!encendido) {
            encendido = true
            println("Lavadora encendida.")
        }else{
            println("La lavadora ya está encendida.")
        }
    }

    override fun apagar() {
        if (encendido) {
            encendido = false
            println("Lavadora apagada.")
        }else{
            println("La lavadora ya está apagada.")
        }
    }

    override fun reiniciar() {
        if (encendido) {
            apagar()
            encender()
            println("La lavadora se está reiniciando...")
        }else{
            println("La lavadora no puede reiniciarse si está apagada.")
        }
    }

}