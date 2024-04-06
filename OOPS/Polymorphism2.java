// Run Time Polymorphism ---> Method Overriding

public class Polymorphism2{
    public static void main(String args[]){
        
        Animal a = new Animal();
        a.eat();
        
        Deer d = new Deer();
        d.eat();

    }
} 

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
} 

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}