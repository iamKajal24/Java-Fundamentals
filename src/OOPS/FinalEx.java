package OOPS;


// final -variable,method,class

class Cal {
	public final void show() {
		System.out.println("in calc show");
	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}
class AdvCal extends Cal{
	
}
public class FinalEx {
	
	public static void main(String[] args) {
		
	   AdvCal cal = new AdvCal();
	   cal.show();
	   cal.add(4, 6);
		
	}

}
