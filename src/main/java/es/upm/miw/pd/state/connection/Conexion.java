package es.upm.miw.pd.state.connection;

public class Conexion {
    private Estado estado;
    private State  State;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = Estado.CERRADO;
        this.State  = new Cerrado();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }    
    
    public void setState(State State) {
        this.State = State;
    }    
    
    public void abrir() {
       this.State.Abrir(this);
    }

    public void cerrar() {
       this.State.Cerrar(this);
    }

    public void parar() {
       this.State.Parar(this);
    }

    public void iniciar() {
       this.State.Iniciar(this);
    }

    public void enviar(String msg) {
       this.State.Enviar(this, msg);
    }

    public void recibir(int respuesta) {
        this.State.Recibir(this, respuesta);
    }

}
