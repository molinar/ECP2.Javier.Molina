package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    
    private Fraction ft;
    
    @Before
    public void before(){
        ft = new Fraction(1, 3);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals (1, ft.getNumerator());
        assertEquals (3, ft.getDenominator());
    }

    @Test
    public void testFraction() {
        ft = new Fraction();
        assertEquals (1, ft.getNumerator());
        assertEquals (1, ft.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.333, ft.decimal(),10e-3);
    }

}