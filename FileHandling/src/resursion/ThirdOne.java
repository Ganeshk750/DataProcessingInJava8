package resursion;

public class ThirdOne {
	static int n1 = 0, n3 = 0, n2 = 1;
	
	public static void main(String[] args) {
		
		int number = 10;
		System.out.print(n1+" "+n2+" ");
		printFun(number - 1);
		
	}

	private static void printFun(int i) {
		if(i > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3+" ");
			printFun(i - 1);
		}
		
	}
	

}
