package Demo1;

public class Bird extends Animal {
    public Bird(String name, int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println("hot hot");
    };
    public void makeMove(){
        System.out.println("bay bay");
    };
    public void makeEat(){
        System.out.println(" mo mo");
    };
    public boolean canFly(){
        return true;
    };
    public void inTT(){
        super.inTT();
    }

}
