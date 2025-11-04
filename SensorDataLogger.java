public class SensorDataLogger {
    public static void logTemperature(Double tempObj, double tempPrimitive) {
        System.out.println("Wrapper Input: " + tempObj);
        System.out.println("Primitive Input: " + tempPrimitive);
    }

    public static void main(String[] args) {
        double temp1 = 36.6;
        Double temp2 = 38.2;

        logTemperature(temp2, temp1);
    }
}
