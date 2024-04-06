public class Abstract_constructor{
    public static void main(String args[]){

        BullDog b = new BullDog();
    }
} 

abstract class Animal{
    Animal(){
        System.out.println("Animal Constructor called...");
    }
} 

class Dog extends Animal{
    Dog(){
        System.out.println("Dog Constructor called...");
    }
} 

class BullDog extends Dog{
    BullDog(){
        System.out.println("BullDog Constructor called...");
    }
}