package Demo1;

import java.util.ArrayList;
import java.util.List;

public class IAnimalServicelmpl implements IAnimalService {
    public ArrayList<Animal> animal = new ArrayList<>();
    public List<Animal> animalsSwimable(List<Animal> animls){
        ArrayList<Animal> canSable = new ArrayList<>();
        for( int i = 0; i < animls.size(); i++){
            if(animls.get(i).canSwim()==true){
                canSable.add(animls.get(i));
            }
        }
        return canSable;
    };
    public List<Animal> animalsFlyable(List<Animal> animls){
        ArrayList<Animal> canFable = new ArrayList<>();
        for( int i = 0; i < animls.size(); i++){
            if(animls.get(i).canFly()==true){
                canFable.add(animls.get(i));
            }
        }
        return canFable;
    };
    public boolean deleteAnimalsSwimable(List<Animal> animls){
        for(int i = animls.size() - 1; i >= 0; i--){
            if(animls.get(i).canSwim()){
                animls.remove(animls.get(i));
            }
        }
        boolean check = false;
        for( int i = 0; i < animls.size(); i++){
            if(animls.get(i).canSwim()){
                return false;
            }
            else continue;
        }
        return true;
    };
    public boolean deleteAnimalsFlyable(List<Animal> animls){
        for( int i = animls.size() - 1; i >= 0; i--){
            if(animls.get(i).canFly()){
                animls.remove(animls.get(i));
            }
        }
        boolean check = false;
        for( int i = 0; i < animls.size(); i++){
            if(animls.get(i).canFly()){
                return false;
            }
            else continue;
        }
        return true;
    };

}
