package EmployeePayrollSystem;

import java.util.Scanner;

public class EmployeePayroll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter hours worked: ");
        int hours = sc.nextInt();

        System.out.print("Enter hourly rate: ");
        double rate = sc.nextDouble();

        double grossSalary = hours * rate;
        double tax = grossSalary * 0.15;
        double netSalary = grossSalary - tax;

        System.out.println("\n--- PAYSLIP ---");
        System.out.println("Employee: " + name);
        System.out.println("Gross Salary: R" + grossSalary);
        System.out.println("Tax (15%): R" + tax);
        System.out.println("Net Salary: R" + netSalary);

        sc.close();
    }
}
