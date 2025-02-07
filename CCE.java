class Person
{
// Attributes or fields
String className;
float classAge;
// Constructor to initialize name and age
public Person(String entryName, float entryAge)
{this.className = entryName;
this.classAge = entryAge;
}

public void displayAge() {
	System.out.println("Age is " + classAge);
}
// Method to display information about the person
public void displayInfo()
{
System.out.println("Name: " + className);
System.out.println("Age: " + classAge);
}
}

public class CCE
{
public static void main(String[] args)
{
// Creating objects of the Person class
Person person1 = new Person("Alice", 30.45f);

Person person2 = new Person("Bob", 25);
// Calling the displayInfo() method on objects
System.out.println("Person 1:");
person1.displayAge();
person1.displayInfo();
System.out.println("\nPerson 2:");
person2.displayInfo();
}
}