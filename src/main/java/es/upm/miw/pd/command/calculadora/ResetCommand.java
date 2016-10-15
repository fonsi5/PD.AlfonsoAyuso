package es.upm.miw.pd.command.calculadora;

public class ResetCommand extends Commands {

    public ResetCommand(Calculator calculator) {
        super(calculator);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String name() {
        return "ReStart";
    }

    @Override
    public void execute() {
        calculator.reset();

    }

}
