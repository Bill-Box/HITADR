import Demo1.Animal;
import Demo1.Dog;
import Demo1.Cat;
import Demo1.Bird;
import Demo1.IAnimalServicelmpl;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            IAnimalServicelmpl ai = new IAnimalServicelmpl();
            ai.animal.add(new Cat("Meo",13));
            ai.animal.add(new Cat("Tocu",15));
            ai.animal.add(new Cat("Sna",10));
            ai.animal.add(new Bird("chim", 9));
            ai.animal.add(new Bird("Taochim", 21));
            ai.animal.add(new Bird("COlae", 15));
            ai.animal.add(new Dog("Roach", 19));
            ai.animal.add(new Dog("Rooh", 14));
            ai.animal.add(new Dog("RoCula", 23));
            ai.deleteAnimalsSwimable(ai.animal);
            ai.deleteAnimalsFlyable(ai.animal);
            for(int i = 0; i < ai.animal.size(); i++){
                    ai.animal.get(i).inTT();
            }
    }
}