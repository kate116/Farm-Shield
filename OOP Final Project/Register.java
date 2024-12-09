public class Register {
    private String Name;
    private String Email;
    private String Location;
    private String Crops;

    // Constructors
    public Register(String Name, String Email, String Location, String Crops) {
        this.Name = Name;
        this.Email = Email;
        this.Location = Location;
        this.Crops = Crops;
    }
    
    //Getters
    public String getName() { return Name; }
    public String getContact() { return Email; }
    public String getLocation() { return Location; }
    public String getCrops() { return Crops; }

    // Display
    public void RegisteredUsers() {
        System.out.println("\n╔═════════════════════════════════╗");
        System.out.println("   Farmer Name: " + Name);
        System.out.println("   Contact: " + Email);
        System.out.println("   Location: " + Location);
        System.out.println("   Crops: " + Crops);
        System.out.println("╚══════════════════════════════════╝");

    }
}

