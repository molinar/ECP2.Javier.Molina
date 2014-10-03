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
    
    @Test
    public void testSumar() {
	    Fraction fraction = new Fraction(3, 5);
	    Fraction fractionResult = new Fraction(14, 15);
	    assertEquals(fractionResult.getNumerator(), ft.sumar(fraction).getNumerator());
	    assertEquals(fractionResult.getDenominator(), ft.sumar(fraction).getDenominator());
    }
    
    @Test
    public void testEsMayor(){
    	Fraction fraction = new Fraction(1,2);
    	assertTrue(ft.esMayor(fraction));

    }

}
