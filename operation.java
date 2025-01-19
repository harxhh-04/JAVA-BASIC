public class operation {
    public static void main(String[] args) {
        int num1 = 10; 
        int num2 = 5;  

        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        System.out.println("\nRelational Operations:");
        System.out.println("Is num1 greater than num2? :" + (num1 > num2));
        System.out.println("Is num1 less than num2? :" + (num1 < num2));
        System.out.println("Is num1 equal to num2? :" + (num1 == num2));
        System.out.println("Is num1 not equal to num2? :" + (num1 != num2));

        System.out.println("\nLogical Operations:");
        boolean isNum1Positive = (num1 > 0);
        boolean isNum2Positive = (num2 > 0);
        System.out.println("Are both numbers positive? " + (isNum1Positive && isNum2Positive));
        System.out.println("Is at least one number positive? " + (isNum1Positive || isNum2Positive));
    }
}