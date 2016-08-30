package kata.PrimeNumbers;

public class NegativeNumberException extends RuntimeException {
	private static final long serialVersionUID = 1L;
		public NegativeNumberException() { super(); }
		public NegativeNumberException(String message) { super(message); }
		public NegativeNumberException(String message, Throwable cause) { super(message, cause); }
}

