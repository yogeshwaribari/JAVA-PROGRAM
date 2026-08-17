/*1. Employee Management System
Statement
Create an Employee POJO with fields:
employeeId, name, department, salary, experience, location, status
Use Map<Integer, Employee> to build an Employee Management System.
Implement CRUD operations and additional logical operations such as finding the highest-paid employee, department-wise salary analysis, experienced employees, and updating employee salary based on performance.
Explanation
Perform the following operations:
1.	Add employee 
2.	Display all employees 
3.	Find employee by ID 
4.	Update employee details 
5.	Delete employee 
6.	Find highest-paid employee 
7.	Find employees having experience greater than 5 years 
8.	Calculate department-wise average salary 
9.	Find employees whose salary is greater than department average 
10.	Give a 10% salary hike to employees having more than 5 years of experience 
11.	Display employees department-wise 
Sample Input
101, Rahul, IT, 75000, 6, Pune, ACTIVE
102, Amit, HR, 55000, 3, Mumbai, ACTIVE
103, Sneha, IT, 90000, 8, Pune, ACTIVE
104, Priya, Finance, 70000, 5, Mumbai, ACTIVE
105, Kiran, IT, 65000, 2, Pune, INACTIVE
Expected Output
Highest Paid Employee:
103 - Sneha - 90000

Employees with Experience > 5:
101 - Rahul
103 - Sneha

IT Department Average Salary:
76666.67

Employees earning above department average:
103 - Sneha - 90000

After 10% Salary Hike:
101 - Rahul - 82500
103 - Sneha - 99000
*/
import java.util.*;

class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double salary;
    private int experience;
    private String location;
    private String status;

    public Employee(int employeeId, String name, String department,
                    double salary, int experience,
                    String location, String status) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
        this.location = location;
        this.status = status;
    }

    // Getters

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


public class EmployeeManagementSystem {

    static Map<Integer, Employee> employees = new HashMap<>();

    public static void main(String[] args) {

        // =====================================================
        // 1. ADD EMPLOYEE
        // =====================================================

        addEmployee(new Employee(
                101,
                "Rahul",
                "IT",
                75000,
                6,
                "Pune",
                "ACTIVE"
        ));

        addEmployee(new Employee(
                102,
                "Amit",
                "HR",
                55000,
                3,
                "Mumbai",
                "ACTIVE"
        ));

        addEmployee(new Employee(
                103,
                "Sneha",
                "IT",
                90000,
                8,
                "Pune",
                "ACTIVE"
        ));

        addEmployee(new Employee(
                104,
                "Priya",
                "Finance",
                70000,
                5,
                "Mumbai",
                "ACTIVE"
        ));

        addEmployee(new Employee(
                105,
                "Kiran",
                "IT",
                65000,
                2,
                "Pune",
                "INACTIVE"
        ));


        // =====================================================
        // 2. DISPLAY ALL EMPLOYEES
        // =====================================================

        System.out.println("========== ALL EMPLOYEES ==========");

        displayAllEmployees();


        // =====================================================
        // 3. FIND EMPLOYEE BY ID
        // =====================================================

        System.out.println("\n========== FIND EMPLOYEE ==========");

        findEmployeeById(103);


        // =====================================================
        // 4. UPDATE EMPLOYEE DETAILS
        // =====================================================

        System.out.println("\n========== UPDATE EMPLOYEE ==========");

        updateEmployee(
                102,
                "Amit",
                "IT",
                60000,
                4,
                "Pune",
                "ACTIVE"
        );

        findEmployeeById(102);


        // =====================================================
        // 5. DELETE EMPLOYEE
        // =====================================================

        System.out.println("\n========== DELETE EMPLOYEE ==========");

        deleteEmployee(105);

        displayAllEmployees();


        // =====================================================
        // 6. FIND HIGHEST PAID EMPLOYEE
        // =====================================================

        System.out.println("\n========== HIGHEST PAID EMPLOYEE ==========");

        findHighestPaidEmployee();


        // =====================================================
        // 7. EXPERIENCE GREATER THAN 5 YEARS
        // =====================================================

        System.out.println("\n========== EXPERIENCE > 5 ==========");

        findExperiencedEmployees();


        // =====================================================
        // 8. DEPARTMENT-WISE AVERAGE SALARY
        // =====================================================

        System.out.println("\n========== DEPARTMENT-WISE AVERAGE SALARY ==========");

        departmentWiseAverageSalary();


        // =====================================================
        // 9. SALARY GREATER THAN DEPARTMENT AVERAGE
        // =====================================================

        System.out.println("\n========== ABOVE DEPARTMENT AVERAGE ==========");

        employeesAboveDepartmentAverage();


        // =====================================================
        // 10. 10% SALARY HIKE
        // =====================================================

        System.out.println("\n========== 10% SALARY HIKE ==========");

        giveSalaryHike();

        displayExperiencedEmployeesWithSalary();


        // =====================================================
        // 11. DISPLAY EMPLOYEES DEPARTMENT-WISE
        // =====================================================

        System.out.println("\n========== DEPARTMENT-WISE EMPLOYEES ==========");

        displayDepartmentWise();
    }


    // =========================================================
    // 1. ADD EMPLOYEE
    // =========================================================

    public static void addEmployee(Employee employee) {

        employees.put(
                employee.getEmployeeId(),
                employee
        );

        System.out.println(
                "Employee added: " +
                employee.getName()
        );
    }


    // =========================================================
    // 2. DISPLAY ALL EMPLOYEES
    // =========================================================

    public static void displayAllEmployees() {

        for (Employee employee : employees.values()) {

            displayEmployee(employee);
        }
    }


    // =========================================================
    // DISPLAY SINGLE EMPLOYEE
    // =========================================================

    public static void displayEmployee(Employee employee) {

        System.out.println(
                employee.getEmployeeId()
                + " - "
                + employee.getName()
                + " - "
                + employee.getDepartment()
                + " - "
                + employee.getSalary()
                + " - "
                + employee.getExperience()
                + " years - "
                + employee.getLocation()
                + " - "
                + employee.getStatus()
        );
    }


    // =========================================================
    // 3. FIND EMPLOYEE BY ID
    // =========================================================

    public static void findEmployeeById(int id) {

        Employee employee = employees.get(id);

        if (employee != null) {

            System.out.println(
                    employee.getEmployeeId()
                    + " - "
                    + employee.getName()
                    + " - "
                    + employee.getDepartment()
                    + " - "
                    + employee.getSalary()
            );

        } else {

            System.out.println(
                    "Employee with ID "
                    + id
                    + " not found."
            );
        }
    }


    // =========================================================
    // 4. UPDATE EMPLOYEE
    // =========================================================

    public static void updateEmployee(
            int id,
            String name,
            String department,
            double salary,
            int experience,
            String location,
            String status) {

        Employee employee = employees.get(id);

        if (employee != null) {

            employee.setName(name);
            employee.setDepartment(department);
            employee.setSalary(salary);
            employee.setExperience(experience);
            employee.setLocation(location);
            employee.setStatus(status);

            System.out.println(
                    "Employee updated successfully."
            );

        } else {

            System.out.println(
                    "Employee not found."
            );
        }
    }


    // =========================================================
    // 5. DELETE EMPLOYEE
    // =========================================================

    public static void deleteEmployee(int id) {

        Employee employee = employees.remove(id);

        if (employee != null) {

            System.out.println(
                    "Employee deleted: "
                    + employee.getName()
            );

        } else {

            System.out.println(
                    "Employee not found."
            );
        }
    }


    // =========================================================
    // 6. FIND HIGHEST PAID EMPLOYEE
    // =========================================================

    public static void findHighestPaidEmployee() {

        Employee highestPaid = null;

        for (Employee employee : employees.values()) {

            if (highestPaid == null
                    || employee.getSalary()
                    > highestPaid.getSalary()) {

                highestPaid = employee;
            }
        }

        if (highestPaid != null) {

            System.out.println(
                    highestPaid.getEmployeeId()
                    + " - "
                    + highestPaid.getName()
                    + " - "
                    + highestPaid.getSalary()
            );
        }
    }


    // =========================================================
    // 7. EXPERIENCE GREATER THAN 5
    // =========================================================

    public static void findExperiencedEmployees() {

        for (Employee employee : employees.values()) {

            if (employee.getExperience() > 5) {

                System.out.println(
                        employee.getEmployeeId()
                        + " - "
                        + employee.getName()
                );
            }
        }
    }


    // =========================================================
    // 8. DEPARTMENT-WISE AVERAGE SALARY
    // =========================================================

    public static void departmentWiseAverageSalary() {

        Map<String, Double> totalSalary =
                new HashMap<>();

        Map<String, Integer> employeeCount =
                new HashMap<>();


        for (Employee employee : employees.values()) {

            String department =
                    employee.getDepartment();

            double salary =
                    employee.getSalary();


            // Add salary

            totalSalary.put(
                    department,
                    totalSalary.getOrDefault(
                            department,
                            0.0
                    ) + salary
            );


            // Increase employee count

            employeeCount.put(
                    department,
                    employeeCount.getOrDefault(
                            department,
                            0
                    ) + 1
            );
        }


        // Calculate average

        for (String department : totalSalary.keySet()) {

            double average =
                    totalSalary.get(department)
                    / employeeCount.get(department);

            System.out.printf(
                    "%s = %.2f%n",
                    department,
                    average
            );
        }
    }


    // =========================================================
    // 9. EMPLOYEES ABOVE DEPARTMENT AVERAGE
    // =========================================================

    public static void employeesAboveDepartmentAverage() {

        Map<String, Double> totalSalary =
                new HashMap<>();

        Map<String, Integer> employeeCount =
                new HashMap<>();


        // Calculate department total salary

        for (Employee employee : employees.values()) {

            String department =
                    employee.getDepartment();

            totalSalary.put(
                    department,
                    totalSalary.getOrDefault(
                            department,
                            0.0
                    ) + employee.getSalary()
            );


            employeeCount.put(
                    department,
                    employeeCount.getOrDefault(
                            department,
                            0
                    ) + 1
            );
        }


        // Find employees above average

        for (Employee employee : employees.values()) {

            String department =
                    employee.getDepartment();


            double average =
                    totalSalary.get(department)
                    / employeeCount.get(department);


            if (employee.getSalary() > average) {

                System.out.println(
                        employee.getEmployeeId()
                        + " - "
                        + employee.getName()
                        + " - "
                        + employee.getSalary()
                );
            }
        }
    }


    // =========================================================
    // 10. GIVE 10% SALARY HIKE
    // =========================================================

    public static void giveSalaryHike() {

        for (Employee employee : employees.values()) {

            if (employee.getExperience() > 5) {

                double oldSalary =
                        employee.getSalary();

                double newSalary =
                        oldSalary * 1.10;

                employee.setSalary(newSalary);
            }
        }
    }


    // =========================================================
    // DISPLAY EXPERIENCED EMPLOYEES WITH NEW SALARY
    // =========================================================

    public static void displayExperiencedEmployeesWithSalary() {

        for (Employee employee : employees.values()) {

            if (employee.getExperience() > 5) {

                System.out.printf(
                        "%d - %s - %.0f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getSalary()
                );
            }
        }
    }


    // =========================================================
    // 11. DISPLAY EMPLOYEES DEPARTMENT-WISE
    // =========================================================

    public static void displayDepartmentWise() {

        Map<String, List<Employee>> departmentMap =
                new HashMap<>();


        for (Employee employee : employees.values()) {

            String department =
                    employee.getDepartment();


            departmentMap
                    .computeIfAbsent(
                            department,
                            key -> new ArrayList<>()
                    )
                    .add(employee);
        }


        for (Map.Entry<String, List<Employee>> entry
                : departmentMap.entrySet()) {

            System.out.println(
                    "\nDepartment: "
                    + entry.getKey()
            );


            for (Employee employee : entry.getValue()) {

                System.out.println(
                        employee.getEmployeeId()
                        + " - "
                        + employee.getName()
                        + " - "
                        + employee.getSalary()
                );
            }
        }
    }
}