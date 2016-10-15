package es.upm.miw.pd.memento.calculadora;

public class MementoCalculadora {

    private int estado;

    public MementoCalculadora(int estado) {
        this.estado = estado;
    }

    public int getValor() {
        return estado;
    }

}
