package es.upm.miw.pd.command.calculadora;

import upm.jbb.IO;

public class SubtractCommand extends Commands {

    public SubtractCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String name() {
        return "Restar";
    }

    @Override
    public void execute() {
        int intToSub = IO.getIO().readInt();
        calculator.subtract(intToSub);

    }

}
