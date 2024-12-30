// Parent class
class Employee {
    protected String name;
    protected int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic employee information
    public void displayInfo() {
        System.out.println("Employee Name: " + name + ", Age: " + age);
    }

    // Method to calculate bonus
    public double calculateBonus() {
        return 1000; // Default bonus
    }
}