package design;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeInfo extends AbstractClass{

     int employee_id;
     String employeeName = "";

    /*
    This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.

    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        - Use all kind of keywords (super, this, static, final, etc)
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */

    /*
     * Make sure to declare and use static, non-static & final fields
     */
    static String companyName;

    /*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */

    /*
     You must have/use multiple constructors
     */
    public EmployeeInfo(int employeeId) {
employee_id = employeeId;

    }

    public EmployeeInfo(String name, int employeeId) {

    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee bonus based on salary and performance.
        It should return the total yearly bonus.
            Example: 10% of salary for best performance, 8% of salary for average performance and so on.
            You can set arbitrary number for performance, so you probably need to send 2 arguments.
     *
     */
    public static double calculateEmployeeBonus(int numberOfYearsWithCompany, int id) {
        double total = 0;
double salary = DbManager.getEmployeeSalary("employee", id);
String performance = DbManager.getEmployeePerformance("employee", id);
        switch (performance){
            case "excellent":
               total = (salary*0.1)*numberOfYearsWithCompany;
               break;
            case "good":
                total = (salary*0.08)*numberOfYearsWithCompany;
                break;
            case "average":
                total = (salary*0.05)*numberOfYearsWithCompany;
                break;

        }

        return total;
    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *
     */
    public static double calculateEmployeePension(int employeeId) {
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        System.out.println("Jointing year: " + convertedJoiningDate);
        System.out.println("Finishing year: " + convertedTodaysDate);

        double yearOfService = DateConversion.differenceOfTwoDatesInYears(convertedJoiningDate,convertedTodaysDate);
        System.out.println("Years of service: " + yearOfService);


        double salary = DbManager.getEmployeeSalary("employee", employeeId);
        total = yearOfService*salary*0.05;
        System.out.println("Total Pension due: " + total);


        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        // Calculate pension

        return total;
    }




    @Override
    public void getEmployeeInfo(int employeeId){
        DbManager.getRowData("employee", employeeId);

    }

    @Override
    public int employeeId() {
        return employee_id;
    }

    @Override
    public String employeeName() {


        return employeeName;
    }

    @Override
    public void assignDepartment(String tableName, String columnName, String value, int employeeID) {
        DbManager.updateInfo(tableName, columnName, value,employeeID);
    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }

 /*   public static void main(String[] args) {
        double years = DateConversion.differenceOfTwoDatesInYears("1/2005","8/2021");
        System.out.println("difference is: " + years);
    }*/


    private static class DateConversion {

        public DateConversion(Months months) {

        }

        public static double differenceOfTwoDatesInYears(String date1, String date2){
            double years = 0;

            String[] extractDate1 = date1.split("/");
            int month1 = Integer.parseInt(extractDate1[0]);
            int year1 = Integer.parseInt(extractDate1[1]);

            String[] extractDate2 = date2.split("/");
            int month2 = Integer.parseInt(extractDate2[0]);
            int year2 = Integer.parseInt(extractDate2[1]);

            years = (((year2-1)*12+month2)-((year1-1)*12+month1))/12;



            return years;
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}
