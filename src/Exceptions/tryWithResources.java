package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.classfile.instruction.BranchInstruction;
import java.nio.file.attribute.BasicFileAttributes;

public class tryWithResources {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		int i = 0;
//		int j = 0;

		int num = 0;

		// BufferedReader bf = null;
		try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
//			j = 18 / i;
			System.out.println("Enter a number");
//			InputStreamReader in = new InputStreamReader(System.in);
//			bf = new BufferedReader(in);

			// or
//			bf = new BufferedReader( new InputStreamReader(System.in));
			num = Integer.parseInt(bf.readLine());
			System.out.println(num);
		}
//		catch (Exception e) {
//			System.out.println("Something went wrong...");
//
//		} 
//		finally {
//			bf.close();
//			System.out.println("Bye");
//		}
	}

}
