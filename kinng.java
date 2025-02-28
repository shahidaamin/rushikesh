// King class
public class King {
    // Fields
    private String name;
    private String country;
    private int age;

    // Constructor to initialize the King object
    public King(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    // Getter for the King's name
    public String getName() {
        return name;
    }

    // Setter for the King's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the King's country
    public String getCountry() {
        return country;
    }

    // Setter for the King's country
    public void setCountry(String country) {
        this.country = country;
    }

    // Getter for the King's age
    public int getAge() {
        return age;
    }

    // Setter for the King's age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display the King's details
    public void displayKingInfo() {
        System.out.println("King's Name: " + name);
        System.out.println("King's Country: " + country);
        System.out.println("King's Age: " + age);
    }

    // Method to simulate the King ruling
    public void rule() {
        System.out.println(name + " is ruling over the country of " + country + ".");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a King object
        King king = new King("Arthur", "Camelot", 35);

        // Display King's information
        king.displayKingInfo();

        // King ruling
        king.rule();
    }
}
