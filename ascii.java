public class ascii {
    public static void main(String[] args) {
        System.out.println("ASCII values of numbers:");
        for (char c = '0'; c <= '9'; c++) {
            System.out.print(c + ": " + (int)c + "\t");
        }

        System.out.println("\nASCII values of uppercase letters:");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + ": " + (int)c + "\t");
        }

        System.out.println("\nASCII values of lowercase letters:");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + ": " + (int)c + "\t");
        }

        System.out.println("\nASCII values of special characters:");
        for (char c = 32; c < 48; c++) { // Special characters from space (32) to 47
            System.out.print(c + ": " + (int)c + "\t");
        }
    }
}
