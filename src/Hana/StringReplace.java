package Hana;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Poopy Maibam";
		
		System.out.println(name);
		
		System.out.println(name.replaceAll("Poopy", "Meow"));
		
		System.out.println(name.replaceAll("a", "O"));
		
		System.out.println(name.replaceAll("M", "Q"));
		
		System.out.println(name.replaceAll("P", "z"));

		String uppercaseName = name.toUpperCase();
		
		System.out.println(uppercaseName);
		
		System.out.println(uppercaseName.replaceAll("P", "Z"));
		
		
	}

}
