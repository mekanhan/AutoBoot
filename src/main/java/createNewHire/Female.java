package main.java.createNewHire;
// Java program select a random element from array

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Female {

    // Drive Function
    public static void main(String[] args)
    {
//        String firstNameFemale [] = {"Alliah", "Ella", "Rella", "Bella", "Valeria", "Lena",
//                "Vika", "Victoria","Lisa", "Lada", "Sasha", "Alexia","Sarah", "Elizabeth" };
        String lastName [] = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Moore",
                "Thomas", "Taylor","Harris", "Martin", "Garcia", "Martinez","Lopez", "Hill",
                "Allen", "Young", "Mitchell", "Perez", "Rogers" };

        // firstFemale list
        List<String> firstFemaleName = new ArrayList<>();

        firstFemaleName.add("Alliah");
        firstFemaleName.add("Ella");
        firstFemaleName.add("Rella");
        firstFemaleName.add("Bella.");
        firstFemaleName.add("Valeria");
        firstFemaleName.add("Lena");
        firstFemaleName.add("Vika");
        firstFemaleName.add("Victoria");
        firstFemaleName.add("Lisa");
        firstFemaleName.add("Lada");
        firstFemaleName.add("Sasha");
        firstFemaleName.add("Alexia");
        firstFemaleName.add("Sarah");
        firstFemaleName.add("Elizabeth");


        Female obj = new Female();

        System.out.println(obj.getRandomFemaleName(firstFemaleName));

    }

    // Function select an element base on index and return an element
    public String getRandomFemaleName(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
