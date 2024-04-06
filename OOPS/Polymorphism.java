// Function Overloading

public class Polymorphism{
    public static void main(String args[]){
        
        Calculator c = new Calculator();

        System.out.println(c.sum(2,3));
        System.out.println(c.sum((float)2.0,(float)3.0));
        System.out.println(c.sum(2,3,1));
    }
} 

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    } 

    int sum(int a,int b,int c){
        return a+b+c;
    }
}