package _15_DesignPatterns.prototype;



public class Main {
    public static void main(String[] args) {
        EmployeeRecord originalRecord = new EmployeeRecord(1, "John Doe", "Manager", 5000, "123 Main St");

        System.out.println("Original Employee Record:");
        originalRecord.showRecord();

        // Clone the original record
        EmployeeRecord clonedRecord = (EmployeeRecord) originalRecord.clone();

        System.out.println("\nCloned Employee Record:");
        clonedRecord.showRecord();

        // Modify the cloned record
        clonedRecord.setName("Jane Smith");

        System.out.println("\nAfter modifying the Cloned Employee Record:");
        clonedRecord.showRecord();
    }
}
