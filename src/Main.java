public class Main{
    public static void main(String[] args) {
        //Creación de una calculadora muy básica
        Calculator myCalculator = new Calculator();

        // Prueba de operaciones básicas
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
        System.out.println(myCalculator.multiply(5,20));
        System.out.println(myCalculator.divide(45,15));
        System.out.println(myCalculator.module(10,3));
    }
}
