package za.ac.cput;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    /* Rigorous Test :-) */
    @Test
    public void subtract()
    {
        App calc = new App();
        int result = calc.subtract(8,5);
        assertEquals(3,result);
    }
}
