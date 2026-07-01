import java.util.*;
public class FinancialForecasting {
    public static double futureValue(double amount, int years){
        if(years == 0){
            return amount;
        }
            return futureValue(amount * 1.10, years - 1);
    }
        public static void main(String[] args) {
        double amount = 1000;
        int years = 3;
        double f = futureValue(amount, years);
        System.out.println(f);
    }
}

