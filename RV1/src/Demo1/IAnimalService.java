package Demo1;

import java.util.List;

public interface IAnimalService {
    public List<Animal> animalsSwimable(List<Animal> animls);
    public List<Animal> animalsFlyable(List<Animal> animls);
    public boolean deleteAnimalsSwimable(List<Animal> animls);
    public boolean deleteAnimalsFlyable(List<Animal> animls);

}
