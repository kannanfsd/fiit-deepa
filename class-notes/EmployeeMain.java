class EmployeeMain {
 public static void main(String[] args){
   Employee employee = new Employee();     //object creation
   employee.empId = 1201;
   employee.empName = "Deepa";
   employee.emailId = "enggdeepa@gmail.com";
   employee.basicPay = 25000L;
   employee.netPay = 18500.0d;
   employee.gender = 'F';
   employee.displayDetails();  //method invoke
 }
}