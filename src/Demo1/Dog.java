package Demo1;

public class Dog extends Animal {
    public Dog(String name, int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println("Sua sua");
    };
    public void makeMove(){
        System.out.println("Chay chay");
    };
    public void makeEat(){
        System.out.println("Anw an");
    };
    public boolean canSwim(){
        return true;
    }
    public void inTT(){
        super.inTT();
    }
}
