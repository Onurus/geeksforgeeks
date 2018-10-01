package onurusta.geeksforgeeks.dynamicProgramming.basicProblems.uglyNumber;

public class UglyNumbersBasicImpl extends AbstractSolution {

	/*
	 * This function divides a by greatest divisible power of b
	 */
	private long maxDivide(long a, long b) {
		while (a % b == 0) {
			a = a / b;
		}
		return a;
	}

	/*
	 * Function to check if a number is ugly or not
	 */
	private long isUgly(long no) {
		no = maxDivide(no, 2);
		no = maxDivide(no, 3);
		no = maxDivide(no, 5);

		return (no == 1) ? 1 : 0;
	}

	/*
	 * Function to get the nth ugly number
	 */
	private long getNthUglyNo(long n) {
		long i = 1;

		// ugly number count
		long count = 1;

		while (n > count) {
			i++;
			if (isUgly(i) == 1) {
				count++;
			}
		}
		return i;
	}

	@Override
	protected long findResult(long n) {
		return getNthUglyNo(n);
	}
}
