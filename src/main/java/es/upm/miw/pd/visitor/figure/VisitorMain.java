package es.upm.miw.pd.visitor.figure;

import java.util.ArrayList;
import java.util.List;

public final class VisitorMain {

    private List<Figure> figures;

    public VisitorMain() {
        figures = new ArrayList<>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public double totalArea() {
        CalcuArea ViAre = new CalcuArea();
        for (Figure figure : figures) {
            figure.accept(ViAre);
        }
        return ViAre.getAreaTot();
    }

    public double totalNumberOfSides() {
        CalcuNumberOfSides ViNumSid = new CalcuNumberOfSides();
        for (Figure figure : figures) {
            figure.accept(ViNumSid);
            ;
        }
        return ViNumSid.getNsidesTot();
    }

}
