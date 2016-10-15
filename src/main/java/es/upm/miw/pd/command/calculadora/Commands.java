package es.upm.miw.pd.command.calculadora;

public abstract class Commands implements Comando {

    protected Calculator calculator;

    public Commands(Calculator calculator) {
        this.calculator = calculator;
    }

    public abstract String name();

    public abstract void execute();

}
