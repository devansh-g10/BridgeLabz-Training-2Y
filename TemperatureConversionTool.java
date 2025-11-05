class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String msg) { super(msg); }
}

public class TemperatureConversionTool {
    public static void convert(double value, char unit) throws InvalidTemperatureException {
        if ((unit == 'C' && value < -273.15) || (unit == 'F' && value < -459.67)) {
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
        }
        if (unit == 'C') {
            double f = (value * 9 / 5) + 32;
            System.out.println(value + "°C = " + f + "°F");
        } else if (unit == 'F') {
            double c = (value - 32) * 5 / 9;
            System.out.println(value + "°F = " + c + "°C");
        } else {
            System.out.println("Invalid unit. Use 'C' or 'F'.");
        }
    }

    public static void main(String[] args) {
        try {
            convert(-300, 'C');
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
