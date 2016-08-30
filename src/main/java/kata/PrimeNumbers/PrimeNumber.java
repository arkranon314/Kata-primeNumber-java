package kata.PrimeNumbers;

public class PrimeNumber 
{
    public boolean isPrimeNumber(int number)
    {
    	boolean result = true;
    	if (number < 0)
    		throw new NegativeNumberException();
    	if (number < 2)
    	    result = false;
    	else{
    		for (int i = number - 1; i > 1; i--) {
    				if ((number % i) == 0)
    					result = false;
    		}
    	}
    	return result;
    }
}