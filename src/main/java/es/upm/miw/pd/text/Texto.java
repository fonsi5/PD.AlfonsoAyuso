package es.upm.miw.pd.text;


public abstract class Texto {
    
    public abstract void add(Texto texto);
    
    public abstract void remove(Texto texto);
    
    public abstract String print(boolean mayus);
    
    public abstract boolean esCompuesto();
}