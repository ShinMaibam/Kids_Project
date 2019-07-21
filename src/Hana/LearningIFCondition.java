package Hana;

public class LearningIFCondition {

	public static void main(String[] args) {
		
		String str1 = "  ENGLAND ";
		String str2 = "   england  ";
		
		String str1lowercase = str1.toLowerCase();
		
		System.out.println("str1lowercase is:" + str1lowercase);
		
		System.out.println("Length of the String 1 is: " + str1.length());
		System.out.println("Length of the String 2 is: " + str2.length());
		
		System.out.println("Length of the String 1 is: " + str1.trim().length());
		System.out.println("Length of the String 2 is: " + str2.trim().length());
		
		if(str1lowercase.trim().equals(str2.trim()))
			System.out.println("Same");
		else
			System.out.println("Different");
		
	}

}
