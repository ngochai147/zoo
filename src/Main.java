import animal.Dog;
import animal.Lion;
import animal.Monkey;

import java.util.ArrayList;

public class Main {
    static ArrayList<Object> zoo;
    public static void main(String[] args) {
        zoo = new ArrayList<>();
        //dvhoang
        Lion lion = new Lion("Siba", "male", 3);
        zoo.add(lion);

        //dvhoang
        Dog dog = new Dog("Ki ", "male", 1);
        zoo.add(dog);
        //manhquynhne
        Monkey monkey = new Monkey("Khỉ đầu chó","male",10);
        zoo.add(monkey);


        //In ra danh sách các con vật có trong sở thú
        printAllAnimals();
    }

    //In ra danh sách các con vật trong sở thú.
    static void printAllAnimals(){
        for (Object animal: zoo) {
            System.out.println(animal);
        }
    }
}
