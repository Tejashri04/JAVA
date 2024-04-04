public class ParametrizedC{
    public static void main(String args[]){
        Student s1 = new Student("Tejashri");
        System.out.println(s1.Sname);
    }
} 

class Student{
    String Sname;

    Student(String Sname){
        this.Sname = Sname;
    }
}