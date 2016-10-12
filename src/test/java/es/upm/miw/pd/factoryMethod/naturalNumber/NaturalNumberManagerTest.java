package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class NaturalNumberManagerTest {
    
    private  NaturalNumberManager  NaturalNumberManager;
    
    @Before
     public void initial() {
        NaturalNumberManager = new NaturalNumberManager();
    }

    @Test
    public void testNaturalNumberEs() {
        NaturalNumberCreator creatorNaturalNumberEs = new NaturalNumberEsCreator();
        NaturalNumberManager.setCreator(creatorNaturalNumberEs);
        NaturalNumberManager.CreateNumber(1);
        assertEquals(this.NaturalNumberManager.getNaturalNumber().getTextValue(),"uno");
    }
    
    @Test
    public void testNaturalNumberEn() {
        NaturalNumberCreator creatorNaturalNumberEn = new NaturalNumberEnCreator();
        NaturalNumberManager.setCreator(creatorNaturalNumberEn);
        NaturalNumberManager.CreateNumber(3);
        assertEquals(this.NaturalNumberManager.getNaturalNumber().getTextValue(),"three");
    }
    
    @Test
    public void testNaturalNumberFr() {
        NaturalNumberCreator creatorNaturalNumberFr = new NaturalNumberFrCreator();
        NaturalNumberManager.setCreator(creatorNaturalNumberFr);
        NaturalNumberManager.CreateNumber(4);
        assertEquals(this.NaturalNumberManager.getNaturalNumber().getTextValue(),"quatre");
    }

    
}