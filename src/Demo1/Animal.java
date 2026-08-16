package Demo1;

public class Animal implements Flyable, Swimable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void makeSound(){};
    public void makeMove(){};
    public void makeEat(){};
    public boolean canFly(){
        return false;
    }
    public boolean canSwim(){
        return false;
    }
    public void inTT(){
        System.out.println("Name: " + getName() +  " Age: " + getAge() );
    }

}
