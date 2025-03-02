public class Main {
    public static void main(String[] args) {
        System.out.println("01. Variables\n");

        // Variables - a reusable container for storing data values; it behaves as if it were a box that holds a value

        // Primitive - simple value stored directly in memory, a stack
        // Reference - memory address of the value, a heap

        // Primitive Data Types
        // 1. int - integer, whole number
        // 2. double - floating point number, decimal number
        // 3. char - single character
        // 4. boolean - true or false
        // 5. byte - small integer

        // Reference Data Types
        // 1. String - sequence of characters
        // 2. Array - collection of similar data types
        // 3. Object - instance of a class

        // Syntax: <data type> <variable name> = <value>;

        // We have 2 steps to create a variable
        // 1. Declaration - data type and variable name
        // 2. Initialization - value

        System.out.println("Example Variables");

        int age; // Declaration
        age = 25; // Initialization

        System.out.println("Age: " + age);

        // Incompatible types
        // age = "25"; -> Error: incompatible types: String cannot be converted to int
        // age = 25.5; -> Error: incompatible types: possible lossy conversion from double to int
        // age = true; -> Error: incompatible types: boolean cannot be converted to int
        // and so on...

        // Variable Naming Rules
        // 1. Variable names are case-sensitive
        // 2. Variable names must start with a letter or an underscore
        // 3. Variable names can only contain letters, numbers, and underscores
        // 4. Variable names cannot contain spaces
        // 5. Variable names cannot be a reserved keyword such as int, double, char, boolean, etc.

        // Variable Naming Conventions
        // 1. Use meaningful names
        // 2. Use camelCase
        // 3. Start with a lowercase letter
        // 4. If the variable name is made up of multiple words, start with a lowercase letter and capitalize the first letter of each subsequent word
        // 5. Avoid using single letter variable names except for temporary variables, for better readability

        // Another Example (Variable Data Types, Continued)
        double price = 19.99;
        char letterA = 'A';
        boolean isTrue = true;

        System.out.println("Price: " + price);
        System.out.println("Letter A: " + letterA);
        System.out.println("Is True: " + isTrue);

        System.out.println("\nExample Reference");

        // Another Example (Reference Data Types, String)
        String name = "Francis Ignacio";
        String email = "ignacio.francis@aelluminate.com";

        System.out.println("My name is " + name + " and my email is " + email);

        // Another Example (Reference Data Types, Array)
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Numbers: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4]);

        // Another Example (Reference Data Types, Object)
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        Person person = new Person("Francis Ignacio", 25);

        System.out.println("Person: " + person.getName() + ", " + person.getAge());

    }
}