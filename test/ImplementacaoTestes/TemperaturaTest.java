
package pkg20191024_testeunitario;

import pkg20191024_testeunitario.TemperaturaMetodos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperaturaTest {
    
    public TemperaturaTest() {
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
    public void testMain() {
        System.out.println("TesteTemperatura");
        TemperaturaMetodos T = new TemperaturaMetodos();
      T.media1(6, 6, 6, 1, 4);
    }
    
}
