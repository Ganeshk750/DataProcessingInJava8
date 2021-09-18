package resursion;

public class FourthOne {

	public static void main(String[] args) {
		
	 int test = 5;
	 printFun(test - 1);
	}

	private static void printFun(int i) {
		if(i < 1) {
			return;
		}else {
			System.out.print(i+" ");
			printFun(i - 1);
			System.out.print(i+" ");
			return;
		}
		
	}

}
