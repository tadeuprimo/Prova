package ImplementacaoTestes;

import U3S1.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSomar() {
        System.out.println("Somar");
        Calculadora c = new Calculadora();
        double res = c.somar(1, 1);
        assertEquals(2, res, 0);
    }

    @Test
    public void testSubtrair() {
        System.out.println("Subtrair");
        Calculadora c = new Calculadora();
        double res = c.subtrair(10, -15);
        assertEquals(25, res, 0);

    }

    @Test
    public void testDividir() {
        System.out.println("Dividir");
        Calculadora c = new Calculadora();
        double res = c.dividir(10.0, 10.0);
        assertNotEquals(Double.isFinite(res), false);
    }

    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        Calculadora c = new Calculadora();
        double res = c.multiplicar(10, 10);
        assertEquals(100, 0.5, res);
      }

}
