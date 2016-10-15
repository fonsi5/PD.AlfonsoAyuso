package es.upm.miw.pd.memento.calculadora;

public interface Mementable<T> {

    public T createMemento();

    public void restoreMemento(T memento);
}
