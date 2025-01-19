class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public Number add(Number other) {
        return new Number(this.value + other.value);
    }

    public Number subtract(Number other) {
        return new Number(this.value - other.value);
    }

    public Number multiply(Number other) {
        return new Number(this.value * other.value);
    }

    public Number divide(Number other) {
        if (other.value == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return new Number(this.value / other.value);
    }
}

public class calculation {
    public static void main(String[] args) {
        Number num1 = new Number(10);
        Number num2 = new Number(5);

        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + num1.add(num2).getValue());
        System.out.println("Subtraction: " + num1.subtract(num2).getValue());
        System.out.println("Multiplication: " + num1.multiply(num2).getValue());
        
        try {
            System.out.println("Division: " + num1.divide(num2).getValue());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}