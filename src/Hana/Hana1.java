package Hana;

public class Hana1 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("This is a test project >> " + i);
			count++;
			if (count >= 5) {
				System.out.println("==========Breaking the for loop at==========>>>" + i);
				break;
			}
		}
	}

	
}
