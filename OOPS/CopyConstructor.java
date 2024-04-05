public class CopyConstructor{
    public static void main(String args[]){
        
        Student s1 = new Student();
        s1.name = "Tejashri";
        s1.roll = 321;
        s1.password = "abcd"; 
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);   //Copy
        s2.password = "ijkl"; 
        s1.marks[2] = 100;
    
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(s2.marks[i]);
        }   

    }
} 

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called ...");
    } 

    //Shallow Copy Constructor
    /* Student(Student s1){
        marks = new int[3];
        
        this.name = name;
        this.roll = roll;
        this.marks = s1.marks; 

    } */

    //Deep Copy Constructor
    Student(Student s1){
        marks = new int[3];
        
        this.name = name;
        this.roll = roll;
        
        for(int i=0 ; i < marks.length ; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}