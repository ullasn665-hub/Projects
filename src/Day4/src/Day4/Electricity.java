package Day4;

public class Electricity {
	public static void main(String[] args){
int[] units= {10,15,12,20,18,14,16};
int sum=0;
for(int i:units) {
	sum+=i;
}
System.out.println("Total sum of 7 days of electricity is:"+sum);
}
}