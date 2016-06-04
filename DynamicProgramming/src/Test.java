
public class Test {
	public static void main(String[] args){
		Programs prog = new Programs();
		long startTime = System.nanoTime();
		int result = prog.fibonacciDynamic(4);
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println(result);
		System.out.println("It took " + duration);
		
		
	}

}
