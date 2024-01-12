public class FindNumberOfAlphabetsInString {

	public static void main(String[] args){

		String str = "My Name Is Gaurav";
		int count = 0;

		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != ' '){
				count++;
			}

		}

		System.out.println("Count Of Alphabets In String: "+count);

	}

}