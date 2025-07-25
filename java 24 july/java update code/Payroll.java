import java.util.*;

public class Payroll {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee("Amit Sharma", 50000);
        emp1.setBonus(7000);
        emp1.setTax(6500);
        emp1.setInsurance(2000);
        emp1.setAllowance(3000);

        Employee emp2 = new Employee("Amit Sharmaji", 500000);
        emp2.setBonus(10000);
        emp2.setTax(20000);
        emp2.setInsurance(5000);
        emp2.setAllowance(10000);

        Employee emp3 = new Employee("A Sharm", 60000);
        emp3.setBonus(5000);
        emp3.setTax(4000);
        emp3.setInsurance(3000);
        emp3.setAllowance(2000);

        Employee emp4 = new Employee("Sharmaji", 10000);
        emp4.setBonus(1000);
        emp4.setTax(500);
        emp4.setInsurance(200);
        emp4.setAllowance(300);

        Employee emp5 = new Employee("Amit", 40000);
        emp5.setBonus(3000);
        emp5.setTax(2000);
        emp5.setInsurance(1000);
        emp5.setAllowance(1500);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        System.out.println("Total Employees: " + employees.size());

        emp1.printPaySlip();

        Collections.sort(employees); 

        System.out.printf( "Name", "EmpID", "NetSalary");
        for (Employee e : employees) {
            System.out.printf( e.getName(), e.getEmpId(), e.getNetSalary());
        }
        exportAllPayslips(employees, "Payslips");
    }
    public static void exportAllPayslips(List<Employee> employees, String folderName) {
    for (Employee e : employees) {
        e.savePayslipToFile(folderName);
    }
}
}