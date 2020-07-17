package main.java.createNewHire;
// Java program select a random element from array

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Female {

    // Drive Function
    public static void main(String[] args) {

        Female obj = new Female();

                                       //Lists

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

        // Vacant Positions list
        List<String> vacantPositions = new ArrayList<>();
        vacantPositions.add("PIG/Econ (High School)");
        vacantPositions.add("librarian (High School)");
        vacantPositions.add("Spanish (Middle School)");
        vacantPositions.add("ELA (Middle School)");
        vacantPositions.add("SPED (Elementary)");
        vacantPositions.add("Kindergarten (Middle School)");
        vacantPositions.add("Earth Science (Middle School)");
        vacantPositions.add("Spanish Teacher (Elementary)");
        vacantPositions.add("Art (Elementary)");
        vacantPositions.add("Food Service Coordinator (BuffSci 2)");
        vacantPositions.add("Building Substitute (BuffSci 2)");
        vacantPositions.add("Director of Guidance (Elementary)");
        vacantPositions.add("Executive Director (Middle School)");

                                     //Random number for Email

        Random randomEmailGenerator = new Random();
        int randomInt = randomEmailGenerator.nextInt(1000);


                                    //Prints

        System.out.println("Salutation: " + obj.getRandomSalutation(salutation));
        System.out.println("First Name: " + obj.getRandomFemaleName(lastName));
        System.out.println("Last Name: " + obj.getRandomLastName(firstFemaleName));
        System.out.println("Applying position: " + obj.getRandomVacPositions(vacantPositions));
        System.out.println("Email: " + obj.getRandomFemaleName(lastName)
                + obj.getRandomLastName(firstFemaleName) + randomInt + "@gmail.com");
        System.out.println("Cell Phone: " + generateRandomDigits(10));


    }
//        public static void salutation(List<String> list){
//            // salutation list
//            List<String> salutation = new ArrayList<>();
//            salutation.add("Ms.");
//            salutation.add("Mrs.");
//            salutation.add("Miss");
//            salutation.add("Ms.");
//            salutation.add("Dr.");
//        }
                                    //Phone
        // Generates a random int with n digits
        public static int generateRandomDigits(int n) {
            int m = (int) Math.pow(10, n - 1);
            return m + new Random().nextInt(9 * m);
        }
                                    //gets

        // Function select an element base on index and return an element
        public String getRandomFemaleName(List<String> list) {
            Random randFemName = new Random();
            return list.get(randFemName.nextInt(list.size()));
        }
        // Function select an element base on index and return an element
        public String getRandomLastName(List<String> list) {
            Random randLastName = new Random();
            return list.get(randLastName.nextInt(list.size()));
        }
        // Function select an element base on index and return an element
        public String getRandomSalutation(List<String> list) {
            Random randSalutation = new Random();
            return list.get(randSalutation.nextInt(list.size()));
        }
        // Function select an element base on index and return an element
        public String getRandomVacPositions(List<String> list) {
            Random randVacPositions = new Random();
            return list.get(randVacPositions.nextInt(list.size()));
        }



}
