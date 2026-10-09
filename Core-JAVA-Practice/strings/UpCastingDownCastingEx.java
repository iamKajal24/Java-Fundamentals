package strings;

public class UpCastingDownCastingEx {
  public static void main(String[] args) {

    // Upcasting

    String s = "Hello";
    Object obj = s;
    // System.out.println(obj);

    // downcasting

    Object obj1 = "Kajal";
    String s2 = (String) obj1;
    // System.out.println(s2);

    Object obj2 = 10;
    String s3 = (String) obj2;
    // System.out.println(s3);

  }

}
