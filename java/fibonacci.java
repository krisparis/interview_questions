package fibonacci;

public class Fibonacci {

	public static int fiboIter(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} else {
			int fibo1 = 1, fibo2 = 0, fibonacci = 1;
			for (int i = 3; i <= n; i++) {
				fibo2 = fibo1;
				fibo1 = fibonacci;
				fibonacci = fibo1 + fibo2;
			}
			return fibonacci;
		}
	}

	public static int fiboRecursive(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} else {
			return fiboRecursive(n - 1) + fiboRecursive(n - 2);
		}
	}

	public static void main(String[] args) {
		/*
		 * First 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		 */
		int n = 10;
		for (int i = 1; i <= n; i++) {
			int result = fiboRecursive(i);
			System.out.println(" " + result);
		}
	}

}
