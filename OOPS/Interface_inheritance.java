// Multiple inheritance using Interface

public class Interface_inheritance{
    public static void main(String args[]){
        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
} 

interface Herbivores{
    void eatGrass();
}

interface Carnivores{
    void eatMeat();
} 

class Bear implements Herbivores,Carnivores{
    public void eatGrass(){
        System.out.println("eats grass");
    } 

    public void eatMeat(){
        System.out.println("eats meat");
    }
}  

