package es.upm.miw.pd.memento.calculadora;

import es.upm.miw.pd.command.calculadora.Calculator;
import es.upm.miw.pd.command.calculadora.Commands;
import upm.jbb.IO;

public class SaveCommand extends Commands {

    private GestorMementos<MementoCalculadora> gestMem;

    public SaveCommand(Calculator calculator, GestorMementos<MementoCalculadora> mementoManager) {
        super(calculator);
        this.gestMem = mementoManager;
    }

    @Override
    public String name() {
        return "Salvar estado";
    }

    @Override
    public void execute() {
        MementoCalculadora memento = ((CalculadoraMementable) calculator).createMemento();
        String key = IO.getIO().readString("Nombre del save");
        gestMem.addMemento(key, memento);

    }

}
