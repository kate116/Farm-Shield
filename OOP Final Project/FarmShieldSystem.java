import java.util.ArrayList;

public class FarmShieldSystem {
    private ArrayList<PestDisease> records;
    private ArrayList<Register> register;

    public FarmShieldSystem() {
        records = new ArrayList<>();
        register = new ArrayList<>();
    }

    public void addRegister(String Name, String Email, String Location, String Crops){
        register.add(new Register(Name, Email, Location, Crops));
        System.out.println("New User has been Registered");
    }

    public void addRecord(String name, String crop, String symptoms, String causes, String measures) {
        records.add(new PestDisease(name, crop, symptoms, causes, measures));
        System.out.println("Record added successfully!");
    }

    public void searchByCrop(String crop) {
        System.out.println("Searching for pests/diseases affecting crop: " + crop);
        boolean found = false;
        for (PestDisease record : records) {
            if (record.getCrop().equalsIgnoreCase(crop)) {
                record.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No records found for crop: " + crop);
        }
    }

    public void searchBySymptoms(String symptom) {
        System.out.println("Searching for pests/diseases with symptoms containing: " + symptom);
        boolean found = false;
        for (PestDisease record : records) {
            if (record.getSymptoms().toLowerCase().contains(symptom.toLowerCase())) {
                record.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No records found for symptom: " + symptom);
        }
    }

    public void displayAllRecords() {
        System.out.println("\n+---------------------------+");
        System.out.println("|\t Pest Diseases Record\t|");
        System.out.println("+---------------------------+");
        for (PestDisease record : records) {
            record.displayInfo();
        }
        if (records.isEmpty()) {
            System.out.println("-----No records available.-----");
        }
    }

    public void displayRegistered(){
        System.out.println("\n+-------------------------------+");
        System.out.println("|\t   Registered User \t|");
        System.out.println("+-------------------------------+");
        for(Register registered : register){
            registered.RegisteredUsers();
        }
    }
}
