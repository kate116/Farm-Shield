import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FarmShieldSystem system = new FarmShieldSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("+---------------------------------------+");
        System.out.println("|\t  Welcome to FarmShield   \t|");
        System.out.println("+---------------------------------------+");
        System.out.println("Please register first before entering.");
        System.out.print("\n>>>Enter the user's name:");
        String Name = scanner.nextLine();
        System.out.print(">>>Enter Contact Information or email: ");
        String Email = scanner.nextLine();
        System.out.print(">>>Enter the user's location: ");
        String Location = scanner.nextLine();
        System.out.print(">>>Enter the user's crop:");
        String Crops = scanner.nextLine();
        system.addRegister(Name, Email, Location, Crops);


        do{
            System.out.println("\n=== FarmShield: Pest and Disease Management ===");
            System.out.println("1. Add New Pest/Disease Record");
            System.out.println("2. Search by Crop");
            System.out.println("3. Search by Symptoms");
            System.out.println("4. Display All Records");
            System.out.println("5. Display All Registered Users");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("\n>>>Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print(">>>Enter Crop: ");
                    String crop = scanner.nextLine();
                    System.out.print(">>>Enter Symptoms: ");
                    String symptoms = scanner.nextLine();
                    System.out.print(">>Enter Causes: ");
                    String causes = scanner.nextLine();
                    System.out.print(">>Enter Preventive Measures: ");
                    String measures = scanner.nextLine();
                    system.addRecord(name, crop, symptoms, causes, measures);
                    break;
                case 2:
                    System.out.print(">>>Enter Crop Name: ");
                    String searchCrop = scanner.nextLine();
                    system.searchByCrop(searchCrop);
                    break;
                case 3:
                    System.out.print(">>>Enter Symptom: ");
                    String searchSymptom = scanner.nextLine();
                    system.searchBySymptoms(searchSymptom);
                    break;
                case 4:
                    system.displayAllRecords();
                    break;
                case 5:
                    system.displayRegistered();
                    break;
                case 6:
                    System.out.println("Exiting. Thank you for using FarmShield!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
