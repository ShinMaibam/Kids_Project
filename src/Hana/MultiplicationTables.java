package Hana;

public class MultiplicationTables {

	public static void main(String[] args) {
		
		int upto = 20;
		int max = 10;
		int result;
		
		for (int j = 2; j <=max; j++) {
			for (int i = 1; i<=upto; i++) {
				result = j * i;
				System.out.println(j + " x " + i + " = " + result);
				
			}
		System.out.println("\n");
		}
	}

}
