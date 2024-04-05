public class Multilevel_inheritance{
    public static void main(String args[]){
        Dog d = new Dog();
        d.eat();
        d.legs = 4;
        System.out.println(d.legs);
    }
} 

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
} 

class Mammal extends Animal{
    int legs;
} 

class Dog extends Mammal{
    String breed;
}