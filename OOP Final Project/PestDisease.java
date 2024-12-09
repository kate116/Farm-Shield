public class PestDisease {
    private String name;
    private String crop;
    private String symptoms;
    private String causes;
    private String preventiveMeasures;

    //Constructors
    public PestDisease(String name, String crop, String symptoms, String causes, String preventiveMeasures) {
        this.name = name;
        this.crop = crop;
        this.symptoms = symptoms;
        this.causes = causes;
        this.preventiveMeasures = preventiveMeasures;
    }
   
    // Getters
    public String getName() { return name; }
    public String getCrop() { return crop; }
    public String getSymptoms() { return symptoms; }
    public String getPreventiveMeasures() { return preventiveMeasures; }

    // Display
    public void displayInfo() {
        System.out.println("\n╔═════════════════════════════════╗");
        System.out.println("   Name: " + name);
        System.out.println("   Crop: " + crop);
        System.out.println("   Symptoms: " + symptoms);
        System.out.println("   Causes: " + causes);
        System.out.println("   Preventive Measures: " + preventiveMeasures);
        System.out.println("╚══════════════════════════════════╝");

    }
}
