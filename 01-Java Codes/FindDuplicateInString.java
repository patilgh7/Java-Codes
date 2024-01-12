public class FindDuplicateInString{

	public static void main(String[] args) {
		

		String first = "abab";
		String second = "cdcdab";

		String third = first+second;

		System.out.println(third);
		
		int count;

		// length of string
		int length = third.length();

		// convert string into array
		char ch[] = third.toCharArray();

		System.out.println();
		System.out.println("Duplicate in Strings : ");

		for(int i = 0; i < length; i++){
			count = 1;
			for(int j = i+1; j < length; j++){
				if(ch[i] == ch[j]){
					count++;
					ch[j]='0';
				}
			}
			
			if(count > 1 && ch[i] != '0') {
				System.out.print(ch[i]+" ");
			}
		}


	}

}