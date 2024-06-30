package Day_1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class UserInfoFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the first name:");
        String FirstName = scanner.nextLine();
        System.out.println("Enter your last name :");
        String LastName = scanner.nextLine();
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your annual Salary :");
        double salary = scanner.nextDouble();
        String fullName = FirstName + " " + LastName;
        DecimalFormat ageFormat = new DecimalFormat("000");
        String formattedAge = ageFormat.format(age);
        DecimalFormat salaryFormat = new DecimalFormat("#, ###.00");
        String formattedSalary = salaryFormat.format(salary);
        System.out.println("Full Name :" + fullName);
        System.out.println("Age :" + formattedAge);
        System.out.println("Annual Salary : $" + formattedSalary);
        scanner.close();
   }

}