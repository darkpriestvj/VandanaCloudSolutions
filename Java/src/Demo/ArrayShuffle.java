package Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayShuffle {
	public static void main(String[] args) {
		
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		arr.add("5");
		arr.add("6");
		arr.add("7");
		
		
		System.out.println("original String is :- " + arr);
		
		Collections.shuffle(arr);
		
		System.out.println("Shuffled List is :- " + arr);
		
	}

}
