package es.upm.miw.pd.command.calculadora;

import upm.jbb.IO;

public class AddCommand extends Commands{

    public AddCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        int intToSum = IO.getIO().readInt();
        calculator.add(intToSum);
    }

    @Override
    public String name() {
        return "Sumar";
    }    
    
    
}
