package day12;

public class HasSquare {

    static boolean hasSquareCycle(int[][] graph) {

        int n = graph.length;
        for (int i = 0; i < n; i++) {
            for (int j : graph[i]) {
                for (int k : graph[j]) {

                    if (k == i)
                        continue;
                    for (int l : graph[k]) {

                        if (l == i)
                            return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] graph = {
            {1, 3},       
            {0, 2},       
            {1, 3},      
            {0, 2}        
        };

        if (hasSquareCycle(graph))
            System.out.println("Square cycle exists");
        else
            System.out.println("No square cycle");
    }
}