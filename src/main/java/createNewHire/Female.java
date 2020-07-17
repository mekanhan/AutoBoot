package main.java.createNewHire;
// Java program select a random element from array

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Female {

    // Drive Function
    public static void main(String[] args) {

        Female obj = new Female();

        // salutation list
        List<String> salutation = new ArrayList<>();
        salutation.add("Ms.");
        salutation.add("Mrs.");
        salutation.add("Miss");
        salutation.add("Ms.");
        salutation.add("Dr.");

        // firstFemale list
        List<String> firstFemaleName = new ArrayList<>();
        firstFemaleName.add("Alliah");
        firstFemaleName.add("Ella");
        firstFemaleName.add("Rella");
        firstFemaleName.add("Bella");
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

        // lastName list
        List<String> lastName = new ArrayList<>();
        lastName.add("Smith");
        lastName.add("Johnson");
        lastName.add("Williams");
        lastName.add("Jones");
        lastName.add("Brown");
        lastName.add("Moore");
        lastName.add("Thomas");
        lastName.add("Taylor");
        lastName.add("Harris");
        lastName.add("Martin");
        lastName.add("Garcia");
        lastName.add("Martinez");
        lastName.add("Lopez");
        lastName.add("Hill");
        lastName.add("Allen");
        lastName.add("Young");
        lastName.add("Mitchell");
        lastName.add("Perez");
        lastName.add("Rogers");


                                    //Prints

        System.out.println(obj.getRandomSalutation(salutation));
        System.out.println(obj.getRandomLastName(firstFemaleName));
        System.out.println(obj.getRandomFemaleName(lastName));

    }
                                    //gets

        // Function select an element base on index and return an element
        public String getRandomFemaleName(List<String> list)
        {
        Random randFemName = new Random();
        return list.get(randFemName.nextInt(list.size()));
        }

        // Function select an element base on index and return an element
        public String getRandomLastName(List<String> list)
        {
        Random randLastName = new Random();
        return list.get(randLastName.nextInt(list.size()));
        }

        // Function select an element base on index and return an element
        public String getRandomSalutation(List<String> list)
        {
            Random randSalutation = new Random();
            return list.get(randSalutation.nextInt(list.size()));
        }

}
