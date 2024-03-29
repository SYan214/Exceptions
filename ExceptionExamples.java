/**
 * The APCS exam tests for the following exceptions.
 *	- ArithmeticException
 *	- NullPointerException
 *	- IndexOutOfBoundsException
 *	- ArrayIndexOutOfBoundsException
 *	- IllegalArgumentException
 */

public class ExceptionExamples {
	public static void main(String[] args) {
		ExceptionExamples ee = new ExceptionExamples();
		ee.run();
	}
	
	public void run() {
		arithmetic();
		nullPointer();
		indexBounds();
		arrayIndexBounds();
		illegalArgument();
	}
	
	public void arithmetic() {
		int x = 1;
		int y = 0;
		try {
			int z = x/y;
		}catch (ArithmeticException e){
			System.out.println("ERROR: ArithmeticException"); // > out.txt, cat out.txt
		}
	}
	
	public void nullPointer() {
		Integer [] arr = new Integer [10];
		try {
			int z = arr[0].intValue();
		}catch (NullPointerException e){
			System.err.println("ERROR: NullPointerException"); // 2> err.txt, cat err.txt
		}
	}
	
	public void indexBounds() {
		String str = "hello";
		try {
			char c = str.charAt(str.length());
		}catch (IndexOutOfBoundsException e){
			System.err.println("ERROR: IndexOutOfBoundsException");
		}
	}
	
	public void arrayIndexBounds() {
		//sub-exception of IndexOutOfBoundsException
		int [] arr = new int [10];
		try {
			int k = arr[10];
		}catch (ArrayIndexOutOfBoundsException e){
			System.err.println("ERROR: ArrayIndexOutOfBoundsException");
		}
	}
	
	public void illegalArgument() {
		String str = "hello";
		try {
			System.out.printf("%d\n", str); //compiler does not do syntax checking inside double quotes
		}catch (IllegalArgumentException e){
			System.err.println("ERROR: IllegalArgumentException");
		}
	}
	
}
