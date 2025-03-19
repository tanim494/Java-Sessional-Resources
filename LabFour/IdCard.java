//Task 2
class IDCard {
    String name;
    int id;
    String department;
    String institution;

    // Constructor to initialize ID Card details
    IDCard(String name, int id, String department, String institution) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.institution = institution;
    }

    // Method to display ID Card details
    void showID() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Institution: " + institution);
    }

    public static void main(String[] args) {
        // Creating an IDCard object
        IDCard myID = new IDCard("Ahsanul Karim Tanim", 1208, "CCE", "International Islamic University Chittagong");
        
        // Displaying ID Card information
        myID.showID();
    }
}
