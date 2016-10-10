package es.upm.miw.pd.state.connection;


public abstract class State {

    public abstract void Abrir(Conexion conex);

    public abstract void Cerrar(Conexion conex);

    public abstract void Iniciar(Conexion conex);
    
    public abstract void Enviar(Conexion conex, String msg);
    
    public abstract void Recibir(Conexion conex, int respuesta);
    
    public abstract void Parar(Conexion conex);
    
}
