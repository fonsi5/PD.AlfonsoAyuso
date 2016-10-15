package es.upm.miw.pd.command.calculadora;

import upm.jbb.IO;

public class PrintCommand extends Commands {

    public PrintCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String name() {
        return "Imprimir total";
    }

    @Override
    public void execute() {
        IO.getIO().println(calculator.getTotal());
    }

}
