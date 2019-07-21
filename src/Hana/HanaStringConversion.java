package Hana;

public class HanaStringConversion {
	
	public static void main(String[] args) {
		
		String mytext = "I Love My Family";
		
		System.out.println(mytext);
		
		//To convert String to Lower Case
		System.out.println(mytext.toLowerCase());
		
		//To convert String to Upper Case
		System.out.println(mytext.toUpperCase());
		
		//To get the length of the String
		System.out.println(mytext.length());
		
		//To get a letter from a given string based on index
		System.out.println(mytext.charAt(2));
		
		//To find first index of a letter in a given string
		System.out.println(mytext.indexOf("m"));
		
		
	}

}
