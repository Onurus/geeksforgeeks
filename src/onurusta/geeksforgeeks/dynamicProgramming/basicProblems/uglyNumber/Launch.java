package onurusta.geeksforgeeks.dynamicProgramming.basicProblems.uglyNumber;

import java.util.List;

//https://www.geeksforgeeks.org/ugly-numbers/
public class Launch {

	private final static AbstractSolution BASIC = new UglyNumbersBasicImpl();
	private final static AbstractSolution DYNAMIC = new UglyNumbersDynamicImpl();

	/* Driver program to test above functions */
	public static void main(String args[]) {
		for (int i = 100; i < 1500; i = i + 100) {
			final int n = i;
			System.out.println("--- " + n + " ---");
			List.of(BASIC, DYNAMIC).forEach(solution -> solution.findAndPrint(n));
		}

	}

}
