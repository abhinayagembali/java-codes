no]kimport java.util.Scanner;

public class Room {
    double length;
    double breadth;
    double height;
    double floorArea;
    double wallArea;
    int noOfFans;
    int noOfWindows;
    int noOfDoors;

    public Room(double length, double breadth, double height, int noOfFans, int noOfWindows, int noOfDoors) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.noOfFans = noOfFans;
        this.noOfWindows = noOfWindows;
        this.noOfDoors = noOfDoors;

        // Calculate floor area
        this.floorArea = length * breadth;

        // Calculate wall area
        double wallArea1 = 2 * (length + breadth) * height;
        double wallArea2 = 0.2 * wallArea1; // 20% of wall area is occupied by doors & windows
        this.wallArea = wallArea1 - wallArea2;
    }

    public void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
        System.out.println("Floor Area: " + floorArea);
        System.out.println("Wall Area: " + wallArea);
        System.out.println("Number of Fans: " + noOfFans);
        System.out.println("Number of Windows: " + noOfWindows);
        System.out.println("Number of Doors: " + noOfDoors);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter number of fans: ");
        int noOfFans = sc.nextInt();

        System.out.print("Enter number of windows: ");
        int noOfWindows = sc.nextInt();

        System.out.print("Enter number of doors: ");
        int noOfDoors = sc.nextInt();

        Room room = new Room(length, breadth, height, noOfFans, noOfWindows, noOfDoors);
        room.displayDetails();
    }
}