package Day10;
import java.util.*;

	public class GreedyActivitySelection {

	    public static void main(String[] args) {

	        int[] start = {1, 3, 0, 5, 8, 5};
	        int[] end = {2, 4, 6, 7, 9, 9};

	        
	        int lastend = end[0];
	        System.out.println("Selected Activites:A");
	      

	        for (int i = 1; i < start.length; i++) {

	            if (start[i] >= lastend) {

	            	System.out.println(" Activity " + (i+1));
					lastend = end[i];
	            }
	        }
	    }
	}

