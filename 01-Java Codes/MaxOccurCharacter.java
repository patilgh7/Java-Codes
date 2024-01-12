

pulic class MaxOccurCharacter {

	public static void main(String[] args) {
		

		String str = "My Name Is Gaurav";

		int arr[] = new int[str.length()];

		char minChar = str.charAt(0);

		char maxChar = str.charAt(0);

		int i, j, min, max;


		//Converts given string into character array 

		 char string[] = str.toCharArray();

		 for(i = 0; i < string.length; i++){

		 	arr[i] = 1;

		 	for(j = i+1; j < string.length; j++){

		 		if(string[i] == string[j] && string[i] != ' ' && string[i] != '0'){

		 			arr[i]++;
		 		}


		 	}
		 }

		 min = max = arr[0];

		 for(i = 0; i < arr.length;i++){

		 	if(max < arr[i]){

		 	max = arr[i];

		 	maxChar = string[i];

		    }	  

		 }

	  System.out.println("Maximum occurring character: " + maxChar);    

	}

}