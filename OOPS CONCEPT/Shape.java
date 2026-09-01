public interface Shape {

    // public static final automaticaly ho jayega 
  public static final int i =34;


//   public abstract automatically ho jayega 
  public abstract void calculateArea();

    
}

class Circle implements Shape{
    private int r;
    
    public Circle(int r) {
        this.r = r;
    }
    
    public void calculateArea(){
        System.out.println("Area of circle is " + (Math.PI*r*r));
    }

    public static void main(String args[]){
        Shape s1= new Circle(5);
        s1.calculateArea();
    
    }
}
