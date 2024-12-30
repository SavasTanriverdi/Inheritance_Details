// Subclass: Manager
class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(String name, int age, int teamSize) {
        super(name, age); // Call parent constructor
        this.teamSize = teamSize;
    }

    // Override displayInfo to include team size
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }

    // Override calculateBonus to provide custom bonus
    @Override
    public double calculateBonus() {
        return 2000 + (teamSize * 100); // Custom bonus calculation
    }

    // Manager-specific method
    public void conductMeeting() {
        System.out.println(name + " is conducting a team meeting.");
    }
}