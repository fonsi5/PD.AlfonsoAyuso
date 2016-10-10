package es.upm.miw.pd.state.connection;

public class Preparado extends State {

    @Override
    public void Abrir(Conexion conex) {

    }

    @Override
    public void Cerrar(Conexion conex) {
        conex.setEstado(Estado.CERRADO);
        conex.setState(new Cerrado());
    }

    @Override
    public void Iniciar(Conexion conex) {

    }

    @Override
    public void Enviar(Conexion conex, String msg) {
        conex.getLink().enviar(msg);
        conex.setEstado(Estado.ESPERANDO);
        conex.setState(new Esperando());        
    }

    @Override
    public void Recibir(Conexion conex, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void Parar(Conexion conex) {
       conex.setEstado(Estado.PARADO);
       conex.setState(new Parado());
    }    
    
}
