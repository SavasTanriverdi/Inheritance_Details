// Main class
public class InheritanceDetails {
    public static void main(String[] args) {
        // Upcasting: Treat Manager as Employee
        Employee emp1 = new Manager("Alice", 40, 5);

        // Upcasting: Treat Developer as Employee
        Employee emp2 = new Developer("Bob", 30, "Java");

        // Display info using overridden methods
        emp1.displayInfo();
        emp2.displayInfo();

        // Call calculateBonus method
        System.out.println("Bonus for emp1: " + emp1.calculateBonus());
        System.out.println("Bonus for emp2: " + emp2.calculateBonus());

        // Downcasting: Access subclass-specific methods
        if (emp1 instanceof Manager) {
            Manager manager = (Manager) emp1;
            manager.conductMeeting();
        }

        if (emp2 instanceof Developer) {
            Developer developer = (Developer) emp2;
            developer.writeCode();
        }
    }
}