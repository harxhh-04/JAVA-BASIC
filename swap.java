public class swap {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5, temp;
        System.out.println("Before swapping (using third variable): num1 = " + num1 + ", num2 = " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping (using third variable): num1 =  " + num1 + ", num2 = " + num2);

        num1 = 10;
        num2 = 5;
        System.out.println("Before swapping (without using third variable): num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping (without using third variable): num1 = " + num1 + ", num2 = " + num2);
    }
}
