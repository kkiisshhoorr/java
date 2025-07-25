import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee extends department implements Comparable<Employee> {
    private static final AtomicInteger idGenerator = new AtomicInteger(1000);

    private int empId;
    private String name;
    private double basicSalary;
    private double bonus;
    private double tax;
    private double insurance;
    private double allowance;
    private LocalDateTime dateofjoinTime;
    private int experience; 

    public Employee(String name, double basicSalary, LocalDateTime dateofjoinTime) {
        this.empId = idGenerator.getAndIncrement();
        this.name = name;
        setBasicSalary(basicSalary);
        this.bonus = 0;
        this.tax = 0;
        this.insurance = 0;
        this.allowance = 0;
        this.dateofjoinTime = dateofjoinTime;
        this.experience = 0; 
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(other.getNetSalary(), this.getNetSalary());
    }

    public double getNetSalary() {
        return basicSalary + bonus - tax - insurance + allowance;
    }


    public int setexperience() {
        LocalDateTime currentDate = LocalDateTime.now();
        int montths = (currentDate.getYear() - dateofjoinTime.getYear()) * 12 + (currentDate.getMonthValue() - dateofjoinTime.getMonthValue());
        if (montths >0) {
            this.experience = montths;
        } else {
            this.experience = 0; 
        }
        return this.experience;
            
        
        
        
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = Math.max(0, basicSalary);
    }

    public void setBonus(double bonus) {
        this.bonus = Math.max(0, bonus);
    }

    public void setTax(double tax) {
        this.tax = Math.max(0, tax);
    }

    public void setInsurance(double insurance) {
        this.insurance = Math.max(0, insurance);
    }

    

    public void setAllowance(double allowance) {
        this.allowance = Math.max(0, allowance);
    }

    public void printPaySlip() {
        File file = new File("payslip.txt");
        if (file.exists()) {
            System.out.println("Payslip already exists. Overwriting...");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating payslip file: " + e.getMessage());
                return;
            }
        }

       try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Date of Joining : " + dateofjoinTime.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy")) + "\n");
            writer.write("Experience      : " + setexperience() + " months\n");
            writer.write("Employee ID     : " + empId + "\n");
            writer.write("Department ID   : " + getDepartmentid() + "\n");
            writer.write("Department Name : " + getDepartmentName() + "\n");
            writer.write("Name            : " + name + "\n");
            writer.write("Basic Salary    : " + basicSalary + "\n");
            writer.write("Bonus           : " + bonus + "\n");
            writer.write("Tax Deducted    : " + tax + "\n");
            writer.write("Insurance       : " + insurance + "\n");
            writer.write("Allowance       : " + allowance + "\n");
            writer.write("Net Salary      : " + getNetSalary() + "\n");
            

        } catch (IOException e) {
            System.out.println("Error writing payslip: " + e.getMessage());
        }
    }


    public void savePayslipToFile(String directoryPath) {
    try {
        File dir = new File(directoryPath);
        if (!dir.exists()) {
            dir.mkdirs(); 
        }

        File file = new File(dir, "Payslip_" + empId + ".txt");

        try (FileWriter writer = new FileWriter(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Date of Joining : ").append(dateofjoinTime.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy"))).append("\n");
            sb.append("Experience      : ").append(setexperience()).append(" years\n");
            sb.append("Employee ID     : ").append(empId).append("\n");
            sb.append("Department ID   : ").append(getDepartmentid()).append("\n");
            sb.append("Department Name : ").append(getDepartmentName()).append("\n");
            sb.append("Name            : ").append(name).append("\n");
            sb.append("Basic Salary    : ").append(basicSalary).append("\n");
            sb.append("Bonus           : ").append(bonus).append("\n");
            sb.append("Tax Deducted    : ").append(tax).append("\n");
            sb.append("Insurance       : ").append(insurance).append("\n");
            sb.append("Allowance       : ").append(allowance).append("\n");
            sb.append("Net Salary      : ").append(getNetSalary()).append("\n");
            sb.append("====================================\n");
            writer.write(sb.toString());
        }

        System.out.println("Payslip saved for " + name + " at " + file.getAbsolutePath());

    } catch (IOException e) {
        System.out.println("Error saving payslip for " + name + ": " + e.getMessage());
    }
}


}

class department {
    private double departmentid = 101;
    private String departmentName = "Human Resources";

    public String getDepartmentName() {
        return departmentName;
    }

    public double getDepartmentid() {
        return departmentid;
    }
}