//package main.java.createNewHire;
//// Java program select a random element from array
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class Gender {
//
//    // Drive Function
//    public static void main(String[] args)
//    {
//
//
//        String firstNameFemale [] = {"Alliah", "Ella", "Rella", "Bella", "Valeria", "Lena",
//                "Vika", "Victoria","Lisa", "Lada", "Sasha", "Alexia","Sarah", "Elizabeth" };
//
//        String lastName [] = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Moore",
//                "Thomas", "Taylor","Harris", "Martin", "Garcia", "Martinez","Lopez", "Hill",
//                "Allen", "Young", "Mitchell", "Perez", "Rogers" };
//
//
//        // create a list of Integer type
//        List<String> listF = new ArrayList<>();
//        // add 5 element in ArrayList
//        listF.add("Ms.");
//        listF.add("Mrs.");
//        listF.add("Miss");
//        listF.add("Dr.");
//
//
//        Gender obj = new Gender();
//
//        // take a random element from list and print them
////        System.out.println(obj.getRandomElement(listGender));
//
////        for (int i=0; i<1; i++){
//            //Female
////            if (obj.getRandomElement(listGender).equals("Ms.") ||
////                    obj.getRandomElement(listGender).equals("Mrs.") ||
////                    obj.getRandomElement(listGender).equals("Miss") ){
//                int index = (int)(Math.random()*10);
//                System.out.println(obj.getRandomElement(listF));
//                System.out.println(firstNameFemale[index]);
//                System.out.println(lastName[index]);
////            }
//
////        }
//    }
//
//    // Function select an element base on index
//    // and return an element
//    public String getRandomElement(List<String> list)
//    {
//        Random rand = new Random();
//        return list.get(rand.nextInt(list.size()));
//
//    }
//}
