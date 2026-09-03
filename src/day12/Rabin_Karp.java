package day12;
public class Rabin_Karp {

    static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        int patternHash = 0;
        int textHash = 0;

        for (int i = 0; i < m; i++) {
            patternHash += pattern.charAt(i);
            textHash += text.charAt(i);
        }

        for (int i = 0; i <= n - m; i++) {

            if (patternHash == textHash) {

                boolean found = true;

                for (int j = 0; j < m; j++) {

                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    System.out.println("Pattern found at index " + i);
                }
            }

      
            if (i < n - m) {
                textHash = textHash - text.charAt(i);

       
                textHash = textHash + text.charAt(i + m);
            }
        }
    }

    public static void main(String[] args) {

        String text = "ABCDABCD";
        String pattern = "BCD";

        search(text, pattern);
    }
}