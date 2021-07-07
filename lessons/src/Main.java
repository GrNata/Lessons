import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void iterTest(Collection<? extends Pet> pets){
        for (Test pet : pets){
            System.out.println("iter = "+pet);
        }
    }

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        iterTest(cats);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

//        TreeSet

    }
}
