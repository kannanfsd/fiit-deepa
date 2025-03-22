public class Employee {
 int empId;
 String empName;
 String emailId;
 long basicPay;
 double netPay;
 char gender;
 boolean flag = true;
 void displayDetails() {
  System.out.println("Employee ID: "+empId);
  System.out.println("Employee Name: "+empName);
  System.out.println("Employee EmailID: "+emailId);
  System.out.println("Employee basicPay: "+basicPay);
  System.out.println("Employee netPay: "+netPay);
  System.out.println("Employee Gender: "+gender);
  System.out.println("Employee Active status: "+flag);
 }
}