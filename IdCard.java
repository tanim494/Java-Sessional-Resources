class IdTemplate {
String idName, idDept;
int idRoll;

public IdTemplate (String entryName, String entryDept, int entryRoll) {
	this.idName = entryName;
	this.idDept = entryDept;
	this.idRoll = entryRoll;
}

public void displayId() {
	System.out.println("Name: " + idName);
	System.out.println("Dept: " + idDept);
	System.out.println("Roll: " + idRoll + "\n");
}

public void changeName(String changeName) {
	this.idName = changeName;
}

public void changeRoll(int changeRoll) {
	this.idRoll = changeRoll;
}

}

public class IdCard {
	public static void main(String[] args) {
		IdTemplate student1 = new IdTemplate("Rakib", "CCE", 10);
		IdTemplate student2 = new IdTemplate("Sayem", "CSE", 16);
		IdTemplate student3 = new IdTemplate("Arfat", "EEE", 43);
		
		student3.displayId();
		student2.displayId();
		student1.displayId();
		
		student3.changeName("Riduan");
		student3.changeRoll(143);
		student3.displayId();
	}
}