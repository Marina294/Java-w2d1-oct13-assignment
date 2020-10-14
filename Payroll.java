import java.text.NumberFormat;
import java.util.Scanner;

public class Payroll {
    public static void main (String[] args) {

        // enter name 
        Scanner callName = new Scanner(System.in);
        System.out.println("Enter employee's name > ");
        String name = callName.next();

        // enter worked hour 
        Scanner callHour = new Scanner(System.in);
        System.out.println("Enter number of hours worked in a week > ");
        double hours = callHour.nextDouble();

        // enter hourly pay rate 
        Scanner callHourlyPay = new Scanner(System.in);
        System.out.println("Enter hourly pay rate > ");
        double hourlyPay = callHourlyPay.nextDouble();

        // enter federal tax 
        Scanner callFederalTax = new Scanner(System.in);
        System.out.println("Enter federal tax withholding rate > ");
        // Decimal point, percentage
        double federalTax = callFederalTax.nextDouble();
        String federalPer = String.format("%1$.1f", federalTax * 100);
        String federalPay = String.format("%1$.1f", Math.floor(hours * hourlyPay * federalTax* 100)/100); 

        // enter state tax 
        Scanner callStateTax = new Scanner(System.in);
        System.out.println("Enter state tax withholding rate > ");
        // Decimal point, percentage
        double stateTax = callStateTax.nextDouble();
        String StatePer = String.format("%1$.1f", stateTax * 100);
        // String statePay = String.format("%1$.1f", hours * hourlyPay * stateTax); 
        
        // Total Deductions 
        // double totalD = Math.floor(federalPay + statePay); 
    
        // print
        // name
        System.out.println("Employee's name: " + name);
        // worked hours
        System.out.println("Hours worked: " + hours);
        // hourly pay rate 
        System.out.println("Pay rate: $" + hourlyPay);
        // Gross pay
        System.out.println("Gross pay: $" + hours * hourlyPay);

        // Deductions
        System.out.println("Deductions: ");        
        // Federal tax 
        System.out.println("  Federal withholding(" + federalPer + "%): $" + federalPay);    
        // State tax 
        System.out.println("  State withholding(" + StatePer + "%): $" + String.format("%1$.2f", Math.floor(hours * hourlyPay * stateTax * 100) / 100)); 

        // Total Deductions
        System.out.println("  Total Deductions: $" + String.format("%1$.2f", hours * hourlyPay * federalTax + hours * hourlyPay * stateTax)); 

       // Net pay 
       System.out.println("Net Pay: $" +  String.format("%1$.2f", ((hours * hourlyPay) - (hours * hourlyPay * federalTax + hours * hourlyPay * stateTax))));



    }
}


/*        // enter name and print
        Scanner callName = new Scanner(System.in);
        System.out.println("Enter employee's name > ");
        String name = callName.next();
        System.out.println("Employee's name: " + name);
        // enter worked hour and print
        Scanner callHour = new Scanner(System.in);
        System.out.println("Enter number of hours worked in a week > ");
        double hours = callHour.nextDouble();
        System.out.println("Number of hours worked in a week: " + hours);
        // enter hourly pay rate and print
        Scanner callHourlyPay = new Scanner(System.in);
        System.out.println("Enter hourly pay rate > ");
        double hourlyPay = callHourlyPay.nextDouble();
        System.out.println("Hourly pay rate: " + hourlyPay);
           // enter federal tax and print
        Scanner callFederalTax = new Scanner(System.in);
        System.out.println("Enter federal tax withholding rate > ");
        double federalTax = callFederalTax.nextDouble();
        String str = String.format("%1$.2f", federalTax);
        System.out.println("Federal tax withholding(" + str + "): $");

        // Scanner.close();
        */