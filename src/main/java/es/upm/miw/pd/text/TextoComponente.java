package es.upm.miw.pd.text;

public class TextoComponente extends TextoCompuesto {

    @Override
    public void add(Texto texto) {
        if (texto.esCompuesto()) {
            componentes.add(texto);
        } else {
            throw new UnsupportedOperationException("Operación no permitida");
        }
    }

    @Override
    public String saltoDeLinea() {
        return "---o---\n";
    }

    @Override
    public boolean esCompuesto() {
        return false;
    }
}
