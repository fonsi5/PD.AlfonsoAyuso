package es.upm.miw.pd.memento.calculadora;

import es.upm.miw.pd.command.calculadora.Calculator;
import es.upm.miw.pd.command.calculadora.Commands;
import upm.jbb.IO;

public class RestoreComand extends Commands {

    private GestorMementos<MementoCalculadora> gestMem;

    public RestoreComand(Calculator calculator, GestorMementos<MementoCalculadora> GestorMementos) {
        super(calculator);
        this.gestMem = GestorMementos;
    }

    @Override
    public String name() {
        return "Restaurar estado";
    }

    @Override
    public void execute() {
        String key = (String) IO.getIO().select(gestMem.keys());
        MementoCalculadora memento = gestMem.getMemento(key);
        ((CalculadoraMementable) calculator).restoreMemento(memento);

    }

}
