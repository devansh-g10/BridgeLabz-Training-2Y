public class BackGroundJob {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Running background job...");
        new Thread(task).start();
    }
}
