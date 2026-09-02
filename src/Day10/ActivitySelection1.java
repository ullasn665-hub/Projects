package Day10;
import java.util.*;

	public class ActivitySelection1 {

	    public static void main(String[] args) {

	        int[] arrival = {9,9,10,10,11};
	        int[] departure = {10,11,10,11,12};

	        
	        int lastdeparture = departure[0];
	        System.out.println("Selected Activites:");
	      

	        for (int i = 1; i < arrival.length; i++) {

	            if (arrival[i] >= lastdeparture) {

	            	System.out.println(" Activity " + (i+1));
					lastdeparture = departure[i];
	            }
	        }
	    }
	}

