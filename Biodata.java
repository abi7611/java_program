import java.util.Scanner;

class BioData {
    // Instance variables to store personal information
    String name;
    int age;
    String gender;
    String address;
    String phoneNumber;
    String email;

    // Constructor to initialize bio data
    public BioData(String name, int age, String gender, String address, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Method to display bio data
    public void displayBioData() {
        System.out.println("Bio Data:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // consume the leftover newline

        System.out.println("Enter your gender: ");
        String gender = scanner.nextLine();

        System.out.println("Enter your address: ");
        String address = scanner.nextLine();

        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        // Creating BioData object
        BioData bio = new BioData(name, age, gender, address, phoneNumber, email);

        // Displaying the collected bio data
        bio.displayBioData();
    }
}