package es.upm.miw.pd.text;

public abstract class Texto {

    public abstract void add(Texto texto);

    public abstract void remove(Texto texto);

    public abstract String dibujar(boolean upper);

    public abstract String saltoDeLinea();

    public abstract boolean esCompuesto();

}
