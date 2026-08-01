public class forLoop {
    public static void main(String args[]){
        
        System.out.println("table of 19");
        for(int i=1;i<=10;i++){
            System.out.println(19*i);
        }

        //odd number print
        System.out.println("odd number print");
        for(int i=1;i<=20;i++){
            if(i!=0 && i%2!=0){
                System.out.println(i);
            }
        }

        //even number print
        System.out.println("even number print");
        for(int i=1;i<=30;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //decerement number print
        System.out.println("decerement number print");
        for(int i=10;i>=0;i--){
            System.out.println(i);
        }

        //first reverse natural number print
        System.out.println("first reverse natural number print");
        int n=20;
        for (int i=n;i>=1;i--){
            System.out.println(i);
        }        
    } 
}
