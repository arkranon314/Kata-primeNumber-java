package kata.PrimeNumbers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class PrimeNumberTest
{
	PrimeNumber Prime;
	
	@Before
	public void setUp() {
		Prime = new PrimeNumber();
	}
	@After
	public void tearDown() {
		Prime = null;
	}
	
	@Test
	public void testFirstPrimeNumber() {
		assertTrue(Prime.isPrimeNumber(2));
	}
	
	@Test
	public void testSecondPrimeNumber() {
		assertTrue(Prime.isPrimeNumber(3));
	}
	
	@Test
	public void testThirdPrimeNumber() {
		assertTrue(Prime.isPrimeNumber(5));
	}
	
	@Test
	public void testFourthPrimeNumber() {
		assertTrue(Prime.isPrimeNumber(7));
	}
	
	@Test
	public void testFifthPrimeNumber() {
		assertTrue(Prime.isPrimeNumber(11));
	}
	
	@Test
	public void testTwentySixthPrimeNumber() {
		assertTrue(Prime.isPrimeNumber(101));
	}
	
	@Test
	public void testNumberZeroNotPrime() {
		assertFalse(Prime.isPrimeNumber(0));
	}
	
	@Test
	public void testNumberOneNotPrime() {
		assertFalse(Prime.isPrimeNumber(1));
	}
	
	@Test
	public void testNumberFourNotPrime() {
		assertFalse(Prime.isPrimeNumber(4));
	}
	
	@Test (expected = NegativeNumberException.class)
	public void testNegativeNumberExceptionThrow() {
		Prime.isPrimeNumber(-1);
	}
}
