package onurusta.geeksforgeeks.dynamicProgramming.basicProblems.uglyNumber;

public abstract class AbstractSolution {

	public void findAndPrint(int n) {
		long startMs = System.currentTimeMillis();
		int result = findResult(n);
		long stopMs = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		sb.append(this.getClass().getSimpleName());
		sb.append("\t result :");
		sb.append(result);
		sb.append("\t time:");
		sb.append(stopMs - startMs);
		sb.append("ms");
		System.out.println(sb.toString());
	}

	protected abstract int findResult(int n);
}
