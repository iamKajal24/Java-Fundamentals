package OOPS;

//@Deprecated
class G {

	public void showTheDataWhichBelongsToThisClass() {
		System.out.println("in G show");
	}

}

class H extends G {

	@Override
	public void showTheDataWhichBelongsToThisClass() {
		System.out.println("in H show");
	}

}

public class AnnotationEx {

	public static void main(String[] args) {
		G g = new H();
		g.showTheDataWhichBelongsToThisClass();;
		
	}

}
