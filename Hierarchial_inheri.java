public class Hierarchial_inheri{
    public static void main(String args[]){
        
        Mammal m = new Mammal();
        m.eat();
        m.walks(); 

        Bird b = new Bird();
        b.eat();
        b.fly();

    }
} 

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
} 

class Mammal extends Animal{
    void walks(){
        System.out.println("Walks");
    }
} 

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}