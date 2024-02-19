public class Calculator {
    // Constructor
    public Calculator(){

    }

    // Our methods for different calculations
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public int multiply(int a, int b){
        return a * b;
    }



    // Main method
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(10,5));
        System.out.println(myCalculator.subtract(10,8));
        System.out.println(myCalculator.divide(100,2));
        System.out.println(myCalculator.multiply(2,10));
    }
}
