package es.upm.miw.pd.visitor.figure;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VisitorMainTest {

    Collection<Figure> coleccion = new ArrayList<Figure>();

    @Before
    public void ini() {
        coleccion.add(new Triangle("Triangulo", 3, 5));
        coleccion.add(new Square("Cuadrado", 4));
    }

    @Test
    public void totalNumberOfSides() {
        CalcuNumberOfSides ViNumSid = new CalcuNumberOfSides();
        for (Figure figure : coleccion) {
            figure.accept(ViNumSid);
        }
        assertEquals(7, ViNumSid.getNsidesTot(), 10e-5);
    }

    @Test
    public void totalArea() {
        coleccion.add(new Circle("Circulo", 2));
        CalcuArea ViAre = new CalcuArea();
        for (Figure figure : coleccion) {
            figure.accept(ViAre);
        }
        assertEquals(36, ViAre.getAreaTot(), 10e-2);
    }
}
