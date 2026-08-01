public class presidenceOperater{
    public static void main(String[] args){
        
       //Predence & Associativity 
       /*left-to-right*/
       /*heightes precedence goes to * and /. they are than evaluated on of left to right associativity */
    

       int a = 6*5-34/2;
       int b=7*56-34/3+65;
       System.out.println(a);
       System.out.println(b);


       //Inrement and Decrement Operator
       int x=5;
       System.out.println(x++); //5
       System.out.println(x); //6

       int y=7;
       System.out.println(++y); //8
       System.out.println(y); //8

       int z=9;
        System.out.println(z--); //9
        System.out.println(z); //8

      System.out.println(--z); //7
      System.out.println(z); //7

      //quiz
      int p=7;
      int q=++p*8;
      System.out.println(q); //64

      char grade='B';
      System.out.println(++grade); //C

      char grade1='D';
      grade1 = (char)(grade1-1);
      System.out.println(grade1);//C
      

      char grade2='A';
       grade2 = (char)(grade2+1);
      System.out.println(grade2); //B

    }
}