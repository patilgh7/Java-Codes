import java.util.*;

public class LargestNumber{

	public static void main(String[] args) {
		
		Integer a[] = {10, 50, 60, 45, 20};

		System.out.println("Largest Number "+getLargestNumber(a));


	}

	public static int getLargestNumber(Integer a[]){

		int total = a.length;

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));

		Collections.sort(list);

		int element = list.get(total - 1);

		return element;


	}

}