import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {
    
    private FizzBuzz fizzBuzz;
    
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }
    
    
    @Test
    public void testNumeroNormal() {
        assertEquals("1", fizzBuzz.answer(1));
        assertEquals("2", fizzBuzz.answer(2));
        assertEquals("4", fizzBuzz.answer(4));
        assertEquals("7", fizzBuzz.answer(7));
        assertEquals("8", fizzBuzz.answer(8));
    }
    
  
    @Test
    public void testMultiploDeTres() {
        assertEquals("fizz", fizzBuzz.answer(3));
        assertEquals("fizz", fizzBuzz.answer(6));
        assertEquals("fizz", fizzBuzz.answer(9));
        assertEquals("fizz", fizzBuzz.answer(12));
    }
    
    
    @Test
    public void testMultiploDeCinco() {
        assertEquals("buzz", fizzBuzz.answer(5));
        assertEquals("buzz", fizzBuzz.answer(10));
        assertEquals("buzz", fizzBuzz.answer(20));
        assertEquals("buzz", fizzBuzz.answer(25));
    }
  
    
    @Test
    public void testMultiplosDeTresECinco() {
        assertEquals("fizzbuzz", fizzBuzz.answer(15));
        assertEquals("fizzbuzz", fizzBuzz.answer(30));
        assertEquals("fizzbuzz", fizzBuzz.answer(45));
        assertEquals("fizzbuzz", fizzBuzz.answer(60));
    }
    
    
    @Test
    public void testSequenciaCompleta() {
        String[] esperado = {
            "1", "2", "fizz", "4", "buzz", 
            "fizz", "7", "8", "fizz", "buzz",
            "11", "fizz", "13", "14", "fizzbuzz"
        };
        
        for (int i = 0; i < esperado.length; i++) {
            assertEquals(esperado[i], fizzBuzz.answer(i + 1));
        }
    }
    
    
    @Test
    public void testNumerosGrandes() {
        assertEquals("fizzbuzz", fizzBuzz.answer(150));
        assertEquals("fizz", fizzBuzz.answer(99));
        assertEquals("buzz", fizzBuzz.answer(100));
    }
}