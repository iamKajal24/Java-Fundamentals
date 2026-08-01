public class Strings{
    public static void main(String[] args){

        //String name=new String("Kajal");
        String name ="Kajal";
        System.out.println(name);
      
        //string all methods in gfg java string methods
         // Original String
        String str = " Hello Java World ";

        // 1. length()
        System.out.println("1. Length = " + str.length());// 18

        // 2. trim()
        System.out.println("2. Trim = " + str.trim());// Hello Java World

        // 3. toUpperCase()
        System.out.println("3. Upper = " + str.toUpperCase());// HELLO JAVA WORLD

        // 4. toLowerCase()
        System.out.println("4. Lower = " + str.toLowerCase());// hello java world

        // 5. charAt()
        System.out.println("5. charAt(2) = " + str.charAt(2));// l

        // 6. substring(beginIndex)
        System.out.println("6. substring(6) = " + str.substring(6));// Java World

        // 7. substring(begin,end)
        System.out.println("7. substring(1,6) = " + str.substring(1,6));// Hello

        // 8. contains()
        System.out.println("8. contains(Java) = " + str.contains("Java"));// true

        // 9. startsWith()
        System.out.println("9. startsWith(Hello) = " + str.trim().startsWith("Hello"));// true

        // 10. endsWith()
        System.out.println("10. endsWith(World) = " + str.trim().endsWith("World"));

        // 11. equals()
        String s1 = "Java";
        String s2 = "Java";
        System.out.println("11. equals = " + s1.equals(s2));//true

        // 12. equalsIgnoreCase()
        String s3 = "JAVA";
        System.out.println("12. equalsIgnoreCase = " + s1.equalsIgnoreCase(s3));//true

        // 13. compareTo()
        System.out.println("13. compareTo = " + "Apple".compareTo("Banana"));//-1

        // 14. compareToIgnoreCase()
        System.out.println("14. compareToIgnoreCase = "
                + "java".compareToIgnoreCase("JAVA"));//0

        // 15. replace()
        System.out.println("15. replace = " + str.replace("Java","Python"));// Hello Python World

        // 16. replaceAll()
        String str2 = "Java123";
        System.out.println("16. replaceAll = "
                + str2.replaceAll("[0-9]",""));// Java

        // 17. replaceFirst()
        String str3 = "cat dog cat";
        System.out.println("17. replaceFirst = "
                + str3.replaceFirst("cat","lion"));// lion dog cat

        // 18. indexOf()
        System.out.println("18. indexOf(Java) = "
                + str.indexOf("Java"));// 7

        // 19. lastIndexOf()
        String str4="Java Java";
        System.out.println("19. lastIndexOf(Java) = "
                + str4.lastIndexOf("Java"));// 5

        // 20. isEmpty()
        String empty="";
        System.out.println("20. isEmpty = "
                + empty.isEmpty());// true

        // 21. isBlank() (Java 11)
        String blank="   ";
        System.out.println("21. isBlank = "
                + blank.isBlank());// true

        // 22. concat()
        System.out.println("22. concat = "
                + "Hello".concat(" Java"));// Hello Java

        // 23. split()
        String data="A,B,C,D";
        String arr[]=data.split(",");// split by comma

        System.out.println("23. split()");
        for(String i:arr)
        {
            System.out.println(i);// A B C D
        }

        //24. join()

        String result=String.join("-","2026","07","20");

        System.out.println("24. join = "+result);// 2026-07-20

        //25. valueOf()

        int number=100;

        String value=String.valueOf(number);

        System.out.println("25. valueOf = "+value);// 100
        
         // 26. toCharArray()
          String str1 = "Hello Java";
         char[] arr1 = str.toCharArray();

        System.out.println("Characters are:");

        for (char c : arr1) {
            System.out.print(c + " ");// H e l l o   J a v a
        }

        // 27. getBytes()
        byte[] bytes = str.getBytes();

        System.out.println("\n27. getBytes()");
        for(byte b : bytes){
            System.out.print(b + " ");
        }

        // 28. subSequence()
        System.out.println("\n\n28. subSequence(0,5)");
        System.out.println(str.subSequence(0,5)); // Hello

        // 29. contentEquals()
        StringBuffer sb = new StringBuffer("Hello Java");
        System.out.println("\n29. contentEquals()");
        System.out.println(str.contentEquals(sb));// true

        // 30. matches()
        System.out.println("\n30. matches()");
        System.out.println("abc123".matches("[a-z0-9]+"));// true

        // 31. repeat()
        System.out.println("\n31. repeat()");
        System.out.println("Java ".repeat(3));// Java Java Java

        // 32. strip()
        String s11 = "   Java   ";
        System.out.println("\n32. strip()");
        System.out.println(s1.strip());// Java

        // 33. stripLeading()
        System.out.println("\n33. stripLeading()");
        System.out.println(s1.stripLeading());// Java

        // 34. stripTrailing()
        System.out.println("\n34. stripTrailing()");
        System.out.println(s1.stripTrailing());// Java

        // 35. lines()
        String multi = "Java\nPython\nC++";// multi-line string

        System.out.println("\n35. lines()");
        multi.lines().forEach(System.out::println);// Java Python C++

        // 36. indent()
        System.out.println("\n36. indent()");
        System.out.println("Java".indent(5));// adds 5 spaces before the string

        // 37. formatted()
        String name1 = "Kajal";
        System.out.println("\n37. formatted()");
        System.out.println("Welcome %s".formatted(name));// Welcome Kajal

        // 38. hashCode()
        System.out.println("\n38. hashCode()");
        System.out.println(str.hashCode());// returns hash code of the string

        // 39. codePointAt()
        System.out.println("\n39. codePointAt()");
        System.out.println(str.codePointAt(0));// returns Unicode code point of the character at index 0

        // 40. codePointBefore()
        System.out.println("\n40. codePointBefore()");
        System.out.println(str.codePointBefore(1));// returns Unicode code point of the character before index 1

        // 41. codePointCount()
        System.out.println("\n41. codePointCount()");
        System.out.println(str.codePointCount(0,str.length()));// returns the number of Unicode code points in the specified text range of the string

        // 42. offsetByCodePoints()
        System.out.println("\n42. offsetByCodePoints()");
        System.out.println(str.offsetByCodePoints(0,4));// returns the index within this string that is offset from the given index by codePointOffset code points

        // 43. chars()
        System.out.println("\n43. chars()");
        str.chars().forEach(System.out::println);// returns an IntStream of Unicode code points in the string

        // 44. codePoints()
        System.out.println("\n44. codePoints()");
        str.codePoints().forEach(System.out::println);// returns an IntStream of Unicode code points in the string

        // 45. copyValueOf()
        char[] ch = {'J','A','V','A'};
        System.out.println("\n45. copyValueOf()");
        System.out.println(String.copyValueOf(ch));// JAVA

        // 46. valueOf(char[])
        System.out.println("\n46. valueOf(char[])");
        System.out.println(String.valueOf(ch));// JAVA

        // 47. format()
        System.out.println("\n47. format()");
        System.out.println(String.format("Age : %d",22));// Age : 22

        // 48. intern()
        String a = new String("Java");
        String b = a.intern();

        System.out.println("\n48. intern()");
        System.out.println(b);// Java

        // 49. regionMatches()

        String x="JavaProgramming";
        String y="Programming";

        System.out.println("\n49. regionMatches()");
        System.out.println(x.regionMatches(4,y,0,11));// true

        // 50. compareTo()

        System.out.println("\n50. compareTo()");
        System.out.println("Apple".compareTo("Mango"));// -1


        //escape sequences in java string
        System.out.println("\nEscape Sequences in Java String"); // escape sequences
        System.out.println("Hello\nWorld"); // newline
        System.out.println("Hello\tWorld"); // tab
        System.out.println("Hello\"World"); // double quote
        System.out.println("Hello\\World"); // backslash


    }
}