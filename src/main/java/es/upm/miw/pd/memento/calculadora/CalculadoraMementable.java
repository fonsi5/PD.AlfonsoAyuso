package es.upm.miw.pd.memento.calculadora;

import es.upm.miw.pd.command.calculadora.Calculator;

public class CalculadoraMementable extends Calculator implements Mementable<MementoCalculadora> {

    @Override
    public void restoreMemento(MementoCalculadora memento) {
        setTotal(memento.getValor());
    }

    @Override
    public MementoCalculadora createMemento() {
        return new MementoCalculadora(getTotal());
    }    
}