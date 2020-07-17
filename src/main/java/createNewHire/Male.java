package main.java.createNewHire;
// Java program select a random element from array

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Male {

    // Drive Function
    public static void main(String[] args)
    {
        String firstNameMale [] = {"Ali", "Berdi", "Rakesh", "Omar", "Rookie", "Daniel",
                "Serik", "Tom","John", "Adam", "Yhlas", "Resul","Vepa", "Sanchez" };
        String lastName [] = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Moore",
                "Thomas", "Taylor","Harris", "Martin", "Garcia", "Martinez","Lopez", "Hill",
                "Allen", "Young", "Mitchell", "Perez", "Rogers" };

        // Salutation list
        List<String> listM = new ArrayList<>();

        listM.add("Mr.");
        listM.add("Dr.");

        Male obj = new Male();

        int index = (int)(Math.random()*10);
        System.out.println(obj.getRandomElement(listM));
        System.out.println(firstNameMale[index]);
        System.out.println(lastName[index]);
    }
    // Function select an element base on index and return an element
    public String getRandomElement(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
