public class SmartHomeLighting {
    public static void main(String[] args) {
        Runnable motionTrigger = () -> System.out.println("Lights ON - Motion detected!");
        Runnable nightTrigger = () -> System.out.println("Soft lights ON - It's night time.");
        Runnable voiceTrigger = () -> System.out.println("Voice command received - Lights dimmed.");

        // Simulate triggers
        motionTrigger.run();
        nightTrigger.run();
        voiceTrigger.run();
    }
}
