

###  **Q1. Add Insurance Deduction**

**Task**:
Add a new private field `insuranceDeduction` in the `Employee` class.

* Provide a setter method `setInsuranceDeduction(double insurance)` with validation (non-negative).
* Update the `calculateNetSalary()` to deduct insurance.
* Show the value in `printPaySlip()`.

---

###  **Q2. Add Allowances Component**

**Task**:
Introduce a new field `allowances`.

* Create a method `setAllowances(double amount)` with non-negative validation.
* Update `calculateNetSalary()` to include allowances.
* Display it in the payslip output.

---

###  **Q3. Track Total Employees Created**

**Task**:
Use the static `idGenerator` to implement a static method `getTotalEmployees()` that returns the total number of employees created.


---

###  **Q4. Prevent Negative Net Salary**

**Task**:
Modify the logic in `calculateNetSalary()` to ensure it **never returns a negative number**, even if tax or deductions exceed total earnings. Return `0` in such cases.

---

###  **Q5. Create a Department Class and Link with Employee**

**Task**:

* Create a new class `Department` with private fields: `departmentId` and `departmentName`.
* Add a private field `department` in the `Employee` class and assign it through constructor or a setter.
* Update `printPaySlip()` to display the department name.

---

###  **Q6. Generate Payslip File (Text File)**

**Task**:
Add a method `savePayslipToFile()` in the `Employee` class to **generate a payslip file** (e.g., `Payslip_1001.txt`) that stores the same content shown on console.

🔸 *Hint*: Use `FileWriter` or `BufferedWriter`.

---

###  **Q7. Add Date of Joining**

**Task**:
Add a new field `LocalDate dateOfJoining` to the `Employee` class.

* Assign it via constructor or setter.
* Display this date in the `printPaySlip()` in a formatted style like `24-July-2025`.

🔸 *Hint*: Use `java.time.LocalDate` and `DateTimeFormatter`.

---

###  **Q8. Display Experience in Months**

**Task**:
Using `dateOfJoining`, calculate how many **months of experience** the employee has (from current date).

* Create method `getExperienceInMonths()`.
* Show this value in the payslip.

---

###  **Q9. Sort Employees by Net Salary**

**Task**:
Create a list of `Employee` objects and sort them by **descending net salary** using `Comparator` or `Comparable`.

* Display employee name, ID, and net salary in sorted order.

🔸 *Hint*: Use `Collections.sort()` with custom comparator.

---

###  **Q10. Export All Payslips**

**Task**:
Create a method in the main class or a helper utility to:

* Accept a list of `Employee` objects.
* Call `savePayslipToFile()` for each employee.
* Generate all payslips in a folder.

---

##  Learning Outcomes

| Concept       | Reinforced                              |
| ------------- | --------------------------------------- |
| Encapsulation | `private` fields with `getters/setters` |
| Validation    | Business rule enforcement               |
| File I/O      | Payslip file generation                 |
| OOP Design    | Composition, static counters            |
| Collections   | Sorting, storing multiple objects       |
| Java Time API | Date of Joining, Duration Calculation   |

