package Day5;

public class Demo7 {
public static void main(String[] args) {
	String str="programming";
	int sum=0;
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				sum=sum+1;
			}
			else
			{
				continue;
			}
		  }
		System.out.println("Repeated number of charcter "+str.charAt(i)+" is "+sum);
		}	
	}
}

