public class Profit_ProfitPercentage {
    public static void main(String[] args) {
        double Cost_Price = 129;
        double Sell_Price = 191;

        double Profit = Sell_Price - Cost_Price;
        double Profit_Per = (Profit / Cost_Price) * 100;
        System.out.printf("The Cost Price is INR " + Cost_Price + " and Selling Price in INR " + Sell_Price);
        System.out.printf("\nProfit is INR " + Profit + " and the Profit Percentage is " + Profit_Per);
    }
} 
    

