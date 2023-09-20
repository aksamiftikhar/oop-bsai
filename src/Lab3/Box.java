package Lab3;
class Employee
{
    int salary;
    int id;
    Date hiringDate;
    Date birthDate;

}
class Date
{
    int month, year, day;
}

public class Box {
    double width;
    double height;
    Color color;

    public Box(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Box shallowCopy() {
        return this;
    }

    public Box deepCopy() {
        return new Box(this.width, this.height, new Color(this.color.name));
    }

    public void displayBoxDetails() {
        System.out.println("Width: " + width + ", Height: " + height + ", Color: " + color.getName());
    }
}

class Color {
    String name;
    Boolean type; // RGB, LAB

    public Color(String name) {
        this.name = name;
    }

    public Color(Color another) { // Copy constructor for deep copy
        this.name = another.name;
    }

    public String getName() {
        return name;
    }
}

class BoxTest {
    public static void main(String[] args) {
        // Experiment 2 demo code
        // Create a box
        // olor c1 = new Color("Red");
        Box originalBox = new Box(10, 5, new Color("Red"));

        // Display original box details
        System.out.println("Original Box:");
        originalBox.displayBoxDetails();

        // Perform a shallow copy and modify the copied box
        Box shallowCopiedBox = originalBox.shallowCopy();
        shallowCopiedBox.width = 15;
        shallowCopiedBox.color.name = "Blue";

        System.out.println("\nShallow Copied Box (after modification):");
        shallowCopiedBox.displayBoxDetails();

        System.out.println("\nOriginal Box (after shallow copy modification):");
        originalBox.displayBoxDetails();

        // Perform a deep copy and modify the copied box
        Box deepCopiedBox = originalBox.deepCopy();
        deepCopiedBox.height = 20;
        deepCopiedBox.color.name = "Green";

        System.out.println("\nDeep Copied Box (after modification):");
        deepCopiedBox.displayBoxDetails();

        System.out.println("\nOriginal Box (after deep copy modification):");
        originalBox.displayBoxDetails();
    }
}

