import java.util.*;

public class SmallestNumber{

	public static void main(String[] args) {
		
		Integer arr[] = {50,100,200,5,10};

		System.out.println("Smallest Number : "+getSmallestNumber(arr));


	}

	public static int getSmallestNumber(Integer arr[]){

		int total = arr.length;

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

		Collections.sort(list);

		int element = list.get(0);

		return element;

	}

}