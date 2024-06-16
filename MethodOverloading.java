package Java_MethodOverloading;

class MathOperations {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        System.out.println(mathOps.add(5, 10));           // Calls add(int, int)
        System.out.println(mathOps.add(5, 10, 15));       // Calls add(int, int, int)
        System.out.println(mathOps.add(5.5, 10.5));       // Calls add(double, double)
    }
}
