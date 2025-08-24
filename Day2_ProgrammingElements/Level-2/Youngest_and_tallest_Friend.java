import java.util.Scanner;

class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's Age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akbar's Age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Anthony's Age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar's Height: ");
        double amarHeight = sc.nextDouble();
        System.out.print("Enter Akbar's Height: ");
        double akbarHeight = sc.nextDouble();
        System.out.print("Enter Anthony's Height: ");
        double anthonyHeight = sc.nextDouble();

        // Youngest
        if (amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Youngest is Amar");
        else if (akbarAge < anthonyAge)
            System.out.println("Youngest is Akbar");
        else
            System.out.println("Youngest is Anthony");

        // Tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Tallest is Amar");
        else if (akbarHeight > anthonyHeight)
            System.out.println("Tallest is Akbar");
        else
            System.out.println("Tallest is Anthony");
    }
}
