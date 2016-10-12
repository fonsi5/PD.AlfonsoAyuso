package es.upm.miw.pd.visitor.figure;

public class CalcuNumberOfSides extends Visitor {

    private double nsidesTot;

    @Override
    public void visitScuare(Square e) {
        this.nsidesTot += 4;
    }

    @Override
    public void visitCircle(Circle e) {
        this.nsidesTot += Double.POSITIVE_INFINITY;
    }

    @Override
    public void visitTriangle(Triangle e) {
        this.nsidesTot += 3;
    }

    public double getNsidesTot() {
        return this.nsidesTot;
    }

}
