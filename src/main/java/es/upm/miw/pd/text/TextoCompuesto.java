package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class TextoCompuesto extends Texto {

    protected List<Texto> componentes;

    public TextoCompuesto() {
        componentes = new ArrayList<>();
    }

    @Override
    public void remove(Texto texto) {
        if (!texto.esCompuesto()) {
            componentes.remove(texto);
        }
    }

    @Override
    public String dibujar(boolean upper) {
        String result = "";
        for (Texto caracter : componentes) {
            result += caracter.dibujar(upper);
        }
        result += saltoDeLinea();
        return result;
    }

    public abstract String saltoDeLinea();

}
