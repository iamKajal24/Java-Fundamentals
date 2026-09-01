public class Dog extends Animal{


    public Dog(){
        super();
        System.out.println("working is there");
    }

    int x=4;

    public void speak(){
        System.out.println(super.colour);
        System.out.println(this.x);
    }
    
}
