package es.upm.miw.pd.visitor.figure;

public abstract class Visitor {
    public abstract void visitScuare(Square e);

    public abstract void visitCircle(Circle e);

    public abstract void visitTriangle(Triangle e);
}
