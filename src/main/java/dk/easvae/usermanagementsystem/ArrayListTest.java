package dk.easvae.usermanagementsystem;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> animalList = new ArrayList<String>();

        animalList.add("Jaguar");
        animalList.add("Panda");
        animalList.add("Lion");
        animalList.add("Bunny");

        animalList.set(0, "Bee");
        animalList.remove(1);
        System.out.println(animalList);

        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i));
        }
    }
}
