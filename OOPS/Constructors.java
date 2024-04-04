public class Constructors{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Tejashri");
        Student s3 = new Student(144);
        // Student s4 = new Student("Tejashri",144);    
        // above line will brings an error .
        //  Bcoz,there is no suitable constructor found for Student(String,int)
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called...");
    } 

    Student(String name){
        this.name = name;
    } 

    Student(int roll){
        this.roll = roll;
    }
}