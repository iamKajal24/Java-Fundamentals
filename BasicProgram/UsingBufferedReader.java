package BasicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter name...");

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bReader.readLine();

		System.out.println("Name : " + s);

	}

}
