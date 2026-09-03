package day12;

public class HasTriangle {
	 static boolean hasTriangle(int[][] graph) {

	        int n = graph.length;

	        for (int i = 0; i < n; i++) {

	            for (int j = 0; j < graph[i].length; j++) {

	                int a = graph[i][j];

	                for (int k = j + 1; k < graph[i].length; k++) {

	                    int b = graph[i][k];

	                    // Check whether a and b are connected
	                    for (int x : graph[a]) {

	                        if (x == b) {
	                            return true;
	                        }
	                    }
	                }
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {

	        int[][] graph = {
	            {1, 2},
	            {0, 2},
	            {0, 1}
	     };

	        System.out.println(hasTriangle(graph));
	 }
}