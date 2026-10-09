package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo8 {

    public static void main(String args[]) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFile() throws FileNotFoundException {

        FileReader fr = new FileReader("abc.txt");

    }
}
