public class PatternCode {

	public static void main(String[] args) {
		
            int totalRow=4;
            int temp = 1;
            for(int i = 1; i <= totalRow; i++){
                for(int j = 1 ; j <= i; j++){

                    System.out.print(temp+" ");
                    temp++;
        
                }

            System.out.println();
            temp = temp+1;
    
            }
		
    }
}
