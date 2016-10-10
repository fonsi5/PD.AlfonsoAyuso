package es.upm.miw.pd.state.connection;

public class Parado extends State {

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
       conex.setEstado(Estado.PREPARADO);
       conex.setState(new Preparado());        
    }

    @Override
    public void Enviar(Conexion conex, String msg) {
       throw new UnsupportedOperationException("Acción no permitida... ");        
    }

    @Override
    public void Recibir(Conexion conex, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");        
    }

    @Override
    public void Parar(Conexion conex) {
        
    }    


}
