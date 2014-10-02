package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    private DecimalCollection dc;

    @Before
    public void before() {
        this.dc = new DecimalCollection();
        this.dc.add(1.1);
        this.dc.add(2);
    }

    @Test
    public void testDecimalCollection() {
        this.dc = new DecimalCollection();
        assertEquals(dc.size(), 0);
    }

    @Test
    public void testSize() {
        assertEquals(dc.size(), 2);
    }

    @Test
    public void testSum() {
        assertEquals(dc.sum(), 3.1, 10e-3);
    }

    @Test
    public void testHigher() {
        assertEquals(dc.higher(), 2, 10e-2);
    }
    
    @Test
    public void testMultiplicar(){
        assertEquals(2.2 ,this.dc.multiplicar(), 10e-3);
    }

}
