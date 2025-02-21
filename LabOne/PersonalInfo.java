//Lab one Task 2
//Remember to use camelCase for naming of classes and variables. It is not mandatory but a good programming practice
public class PersonalInfo {
    public static void main(String[] args) {
        // Defining personal information variables
        String name = "Ahsanul Karim Tanim";
        String studentId = "E221013";
        int age = 22;
        String email = "Tanim494@gmail.com";
        String phone = "+8801843377789";
        String address = "Laliarhat, Hathazari, Chattogram";

        // Using println to display the information
        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);

        // Using printf just once after all println statements
        System.out.printf("\nFormatted Information:\nName: %s\nStudent ID: %s\nAge: %d\nEmail: %s\nPhone: %s\nAddress: %s\n", name, studentId, age, email, phone, address);
    }
}
