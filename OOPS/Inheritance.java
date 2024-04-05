public class Inheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
} 

// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    } 

    void breathe(){
        System.out.println("Breathe");
    }
} 

// Derived Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}