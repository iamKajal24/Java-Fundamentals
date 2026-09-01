public class Parent {

    // this is overridden method
    public void m1(){
        System.out.println("i am parents methods");
    }
    
}

class child extends Parent{

    // this is overriding method
    //co-varient returns type allowed
    public void m1(){
        System.out.println("i am m1 of child");
    }

}
