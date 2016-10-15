package es.upm.miw.pd.memento.calculadora;

import es.upm.miw.pd.command.calculadora.AddCommand;
import es.upm.miw.pd.command.calculadora.CommandManager;
import es.upm.miw.pd.command.calculadora.PrintCommand;
import es.upm.miw.pd.command.calculadora.ResetCommand;
import es.upm.miw.pd.command.calculadora.SubtractCommand;
import upm.jbb.IO;

public class MainCalculator {
    private CommandManager commandManager;

    public MainCalculator() {
        CalculadoraMementable calculator = new CalculadoraMementable();
        GestorMementos<MementoCalculadora> mementoManager = new GestorMementos<MementoCalculadora>();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new SaveCommand(calculator,mementoManager));
        this.commandManager.add(new RestoreCommand(calculator,mementoManager));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculator());
    }
}
