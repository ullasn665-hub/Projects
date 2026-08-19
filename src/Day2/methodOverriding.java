package IOT_TRAINING;

public class methodOverriding {
void movie() {
	System.out.print("Best Kannada Movie:Upendra");
}
public static void main(String[] args) {
   Yash film=new Yash();
   film.movie();
   
}
}
class Yash extends methodOverriding{
	void movie() {
		System.out.println("Best Kannada Movie:KGF");
		
	}
}

