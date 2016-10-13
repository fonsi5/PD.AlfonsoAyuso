package es.upm.miw.pd.text;

public class Caracter extends Texto {

    private char character;

    public Caracter(char character) {
        this.character = character;
    }

    @Override
    public void add(Texto texto) {

    }

    @Override
    public String dibujar(boolean upper) {
        if (upper) {
            return String.valueOf(character).toUpperCase();
        } else {
            return String.valueOf(character);
        }

    }

    @Override
    public boolean esCompuesto() {
        return false;
    }

    @Override
    public void remove(Texto texto) {

    }

    @Override
    public String saltoDeLinea() {
        return "";
    }

}
