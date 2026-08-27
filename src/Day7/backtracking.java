package Day7;

public class backtracking {
static String correctreligion="Hindu";
static void findReligion(String religion) {
	System.out.println("Tell correct religion for name Ullas");
	if(religion.equals(correctreligion)){
		System.out.println("Correct religion is:"+religion);
		return;
	}
	System.out.println("Invalid religion:"+religion);
}
public static void main(String[] args) {
	findReligion("Christian");
	findReligion("Muslim");
	findReligion("Zorastrian");
	findReligion("Buddhism");
	findReligion("Jainism");
	findReligion("Hindu");
}
}
