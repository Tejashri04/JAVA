public class Constructor{
    public static void main(String args[]){
        Student s1 = new Student();
    }
} 

class Student{
    Student(){
        System.out.println("Constructor is called ...");
    }
}