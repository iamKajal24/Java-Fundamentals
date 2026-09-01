public class ConstrutorStudent {


    int stuId;
    String stuName;
    String stuCity;
    String stuSub;

    public ConstrutorStudent(){
        System.out.println("Creating Object");
    }

    public ConstrutorStudent(int id, String name,String city,String sub){
        stuId=id;
        stuName=name;
        stuCity=city;
        stuSub=sub;
    }

    public void display(){
        System.out.println("id = " + stuId);
        System.out.println("name = "+ stuName);
        System.out.println("city = "+ stuCity);
        System.out.println("subject = "+ stuSub);
        System.out.println(this.stuName);
    }
    
}
