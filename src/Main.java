/**
 * Book My Stay Application - Use Case 2
 * This class demonstrates room initialization using
 * abstraction, inheritance, and static availability.
 *
 * @author Aditya Jain
 * @version 2.0
 */

// Abstract class
abstract class Room {
    protected String type;
    protected int beds;
    protected double price;

    // Constructor
    public Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    // Abstract method
    public abstract void displayRoomDetails();
}

// Single Room class
class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 1500);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println(type + " | Beds: " + beds + " | Price: ₹" + price);
    }
}

// Double Room class
class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 2500);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println(type + " | Beds: " + beds + " | Price: ₹" + price);
    }
}

// Suite Room class
class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 5000);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println(type + " | Beds: " + beds + " | Price: ₹" + price);
    }
}

// Main class
public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Polymorphism (parent reference)
        Room r1 = new SingleRoom();
        Room r2 = new DoubleRoom();
        Room r3 = new SuiteRoom();

        System.out.println("===== Room Types & Availability =====");

        r1.displayRoomDetails();
        System.out.println("Available: " + singleAvailable + "\n");

        r2.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable + "\n");

        r3.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}