package Day10;

public class JumpProblem {
  public static void main(String[] args) {
	  int[] nums= {2,1,1,0,4};
	  int maxReach=0;
	  for(int i=0;i<nums.length;i++) {
		  if(i>maxReach) {
			 break; 
		  }
		  maxReach=Math.max(maxReach, i+nums[i]);
	  }
	  if(maxReach>=nums.length-1) {
		  System.out.println("Can Reach the last position");
	  }
	  else {
		  System.out.println("Cannot reach the last position");
	  }
  }
}
