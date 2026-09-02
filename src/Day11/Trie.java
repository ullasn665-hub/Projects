package Day11;

public class Trie {

    static class Node {
        Node[] child = new Node[26];
        boolean end;
    }

    static Node root = new Node();

    static void insert(String word) {

        Node current = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.child[index] == null) {
                current.child[index] = new Node();
            }

            current = current.child[index];
        }

        current.end = true;
    }
    static boolean search(String word) {

        Node current = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.child[index] == null) {
                return false;
            }

            current = current.child[index];
        }

        return current.end;
    }

 public static void main(String[] args) {
	 insert("car");
	 insert("cat");
	 insert("cab");
	 insert("can");
	 insert("cap");
	 System.out.println("Words inserted");
	 System.out.println(search("cat"));
     System.out.println(search("car"));
     System.out.println(search("can"));
     System.out.println(search("cab"));
     System.out.println(search("cap"));
 }
}
