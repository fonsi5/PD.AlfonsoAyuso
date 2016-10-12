package es.upm.miw.pd.visitor.figure;

public class CalcuArea extends Visitor {

    private double areaTot;

    @Override
    public void visitScuare(Square e) {
        this.areaTot += e.getSide() * e.getSide();
    }

    @Override
    public void visitCircle(Circle e) {
        this.areaTot += Math.PI * e.getRadius() * e.getRadius();
    }

    @Override
    public void visitTriangle(Triangle e) {
        this.areaTot += e.getHeight() * e.getBase();
    }

    public double getAreaTot() {
        return this.areaTot;
    }

}
