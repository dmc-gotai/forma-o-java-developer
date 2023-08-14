package edu.aulas.anatomiadasclasses;

public class MyClass {
    public static void main(String [] args) {
        
        System.out.println("Hello, Java!");

        String firstName = "Tiago";
        String seccondName = "Macedo";
        String fullName = fullName(firstName, seccondName);
        
        int myYearOfBirth = 1993;
        boolean isBrazilian = true;

        System.out.println("Name: " + fullName + "\nBirth year: " + myYearOfBirth + "\nBrazilian: " + isBrazilian);


    }

    public static String fullName (String firstName, String seccondName) {
        return firstName.concat(" ").concat(seccondName);
    }
}
