public class Palindrome{

	public static void main(String[] args) {
		
		String str = "radar";

		String reverseString = "";

		int stringlength = str.length();


		for(int i = stringlength - 1; i >= 0; i--){
			reverseString = reverseString + str.charAt(i);
		}

		if(str.equals(reverseString)){
			System.out.println(str+" is Palidrome");
		}
		else{

			System.out.println(str+" is not Palidrome");
		}

		
	}
}
