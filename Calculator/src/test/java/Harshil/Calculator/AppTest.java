package Harshil.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAddPositive()
    {
    	int expectedResult = 2;
    	int actualResult = Calculator.Add(1, 1);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testAddNegetive()
    {
    	int expectedResult = 0;
    	int actualResult = Calculator.Add(1, 1);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testSubtractPositive()
    {
    	int expectedResult = 0;
    	int actualResult = Calculator.Subtract(1, 1);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testSubtractNegetive()
    {
    	int expectedResult = 1;
    	int actualResult = Calculator.Subtract(1, 1);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testMultiplyPositive()
    {
    	int expectedResult = 1;
    	int actualResult = Calculator.Multiply(1, 1);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testMultiplyNegetive()
    {
    	int expectedResult = 2;
    	int actualResult = Calculator.Multiply(1, 1);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testDividePositive()
    {
    	int expectedResult = 1;
    	int actualResult = Calculator.Divide(1, 1);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testDivideNegetive()
    {
    	int expectedResult = 0;
    	int actualResult = Calculator.Divide(1, 1);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test (expected = ArithmeticException.class)
    public void testDivideExceptions()
    {
    	int actualResult = Calculator.Divide(1, 0);
    }
}
