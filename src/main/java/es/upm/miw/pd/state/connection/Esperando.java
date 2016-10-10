package es.upm.miw.pd.state.connection;

public class Esperando extends State {

    @Override
    public void Abrir(Conexion conex) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void Cerrar(Conexion conex) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void Iniciar(Conexion conex) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void Enviar(Conexion conex, String msg) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void Recibir(Conexion conex, int respuesta) {
        if (respuesta == 0) {
            conex.setEstado(Estado.PREPARADO);
            conex.setState(new Preparado());
        } else {
            conex.setEstado(Estado.CERRADO);
            conex.setState(new Cerrado());
        }

    }

    @Override
    public void Parar(Conexion conex) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

}
