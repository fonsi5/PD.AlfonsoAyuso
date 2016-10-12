package es.upm.miw.pd.visitor.figure;

public interface Element {
    void accept(Visitor v);
}
