package Demo;

import java.util.ArrayList;
import java.util.Random;

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
		
		shuffleArrayList(arr);
		
		System.out.println("Shuffled List is :- " + arr);
		
	}

	public static void shuffleArrayList(ArrayList<String> arr) {
        Random rand = new Random();
        int n = arr.size();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            // Swap arr[i] and arr[j]
            String temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);

}
