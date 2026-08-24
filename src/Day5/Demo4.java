package Day5;

public class Demo4 {
public static void main(String[] args) {
	String str="abc";
	for(int i=0;i<=str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			System.out.println(str.substring(i,j));
		}
		
	}
}
}
//str.substring(beginindex,endindex)
//substring from begin string to endindex-1