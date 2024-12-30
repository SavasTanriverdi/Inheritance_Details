// Subclass: Developer
class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int age, String programmingLanguage) {
        super(name, age); // Call parent constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Override displayInfo to include programming language
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }

    // Developer-specific method
    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}