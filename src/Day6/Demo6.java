package Day6;
import java.util.*;
public class Demo6 {
public static void main(String[] args) {
	

	        String[] arr1 = {"Apple", "Banana", "Mango"};
	        String[] arr2 = {"Banana", "Orange", "Apple"};
	        String[] merged = new String[arr1.length + arr2.length];

	        for (int i = 0; i < arr1.length; i++) {
	            merged[i] = arr1[i];
	        }

	        for (int i = 0; i < arr2.length; i++) {
	            merged[arr1.length + i] = arr2[i];
	        }
	        HashSet<String> set = new HashSet<>();

	        for (String s : merged) {
	            set.add(s);
	        }

	        System.out.println("Merged array:");
	        System.out.println(Arrays.toString(merged));

	        System.out.println("After removing duplicates:");
	        System.out.println(set);
	    }
	
}

