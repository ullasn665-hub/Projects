package day12;
import java.util.LinkedList;
import java.util.Queue;
public class HasCycle {
	static boolean hasCycle(int[][] graph) {

        int n = graph.length;
        boolean[] visited = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> parent = new LinkedList<>();

        for (int start = 0; start < n; start++) {

            if (visited[start])
                continue;

            visited[start] = true;
            queue.add(start);
            parent.add(-1);

            while (!queue.isEmpty()) {

                int current = queue.poll();
                int par = parent.poll();

                for (int next : graph[current]) {

                    if (!visited[next]) {

                        visited[next] = true;
                        queue.add(next);
                        parent.add(current);

                    } else if (next != par) {

                        return true;
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

        System.out.println(hasCycle(graph));
    }
}