import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class Main {
    public static void main(String[] args) {
        SalesReport sales = new SalesReport();
        EmployeeReport hr = new EmployeeReport();

        System.out.println("==== Company Analytics Report ====\n");
        sales.printSalesData();
        System.out.println();
        hr.printEmployeePerformance();
    }
}
