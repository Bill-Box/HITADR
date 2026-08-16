package Demo1;

public class Cat extends Animal{
    public Cat(String name, int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println("Meo meo");
    };
    public void makeMove(){
        System.out.println("Chya chay");
    };
    public void makeEat(){
        System.out.println("An an");
    };
    public void inTT(){
        super.inTT();
    }

}
