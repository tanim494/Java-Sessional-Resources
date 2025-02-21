/**
 * This program demonstrates the use of classes and objects in Java.
 * It defines a blueprint (Human class) that will be used to create human objects.
 * 
 * Author: Ahsanul Karim Tanim
 * Date: February 7, 2025
 */

// This class is used as a human blueprint. It'll be used to create human objects (in programming terms).
class Human {
    String className, classGender;
    int classAge;

    // Constructor of the Human class. The constructor name must be the same as the class name.
    public Human(String entryName, String entryGender, int entryAge) {
        // Assigning values to the object's attributes (class variables).
        this.className = entryName;
        this.classAge = entryAge;
        this.classGender = entryGender;
    }

    // This is a function/method to display the information of a human object.
    public void displayInfo() {
        System.out.println("The Person's Name: " + className);
        
        // Checking gender to use the correct pronoun when displaying age.
        if (classGender.equalsIgnoreCase("Male")) {
            System.out.println("He is " + classAge + " years old");    
        } else {
            System.out.println("She is " + classAge + " years old");
        }
    }
}

// This is our main class. This class contains the main() method, which is the starting point of the program.
public class LabOne {
    public static void main(String[] args) {
        /* 
         * Using the Human class, we have created two objects: male and female.
         * Remember, the arguments must be passed in the same order as defined in the constructor method.
         */
        Human male = new Human("Rakib", "Male", 25);
        Human female = new Human("Tarin", "Female", 20);

        // Now that the objects are created, we can call the displayInfo() method on them to see their information.
        male.displayInfo();
        female.displayInfo();
    }
}
