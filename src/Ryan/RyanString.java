package Ryan;

public class RyanString {

	public static void main(String[] args) {
		
		String text1 = "Poopy";
		String text2 = "Pants";
		String jointext = null;
		String modifiedtext = "Ooo la la mama mia cucu meow meow";
		String substr = null;
		String phnum = "+91 761-926-7278";
		
		System.out.println(phnum.replaceAll("[^0-9]", ""));
		System.out.println(phnum.replaceAll("9", "0"));
		
		jointext ="who is " + text1 + "-" + text2 + "?";
		
		System.out.println(jointext);
		//System.out.println("Joined Text is: " + jointext);
		substr = jointext.substring(10, 14);
		System.out.println(substr);
		
		System.out.println(jointext.substring(10));
		
		System.out.println(modifiedtext.lastIndexOf("o"));
		
		
		
	}

}
