package OOPS;

public class String_Buffer_Builder {

	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("Kajal");
		sBuffer.append(" pandit");
		// sBuffer.deleteCharAt(2);
		// sBuffer.insert(1, 'b');
		sBuffer.insert(0, "java ");
		sBuffer.substring(3, 7);
		sBuffer.setLength(30);
		System.out.println(sBuffer);
		System.out.println(sBuffer.capacity());
		System.out.println(sBuffer.length());
		System.out.println(sBuffer.charAt(3));
		System.out.println(sBuffer.substring(1, 3));

	}
}
