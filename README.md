# Employee-Management-System

Table - employees_tbl

- id int
- name varchar(20)
- dept varchar(20)
- daysAttended int

Class - SalaryCalculator

- int getGrossSalary(Employee, actualSalary)
- abstract int calculateNetSalary(Employee, actualSalary)

Class PermanentEmployeeSalaryCalculator

- monthlySalary
- providentFund //deductables
- incomeTax //deductables
- int calculateNetSalary(Employee, actualSalary)

Class ContractEmployeeSalaryCalculator

- perDayRate
- taxDeductions //deductables
- int calculateNetSalary(Employee, actualSalary)

Interface EmployeeDAO

- addEmployee(Employee e)
- deleteEmployee(int id)
- updateEmployee(Employee e)
- findEmployee(Employee e)
- showAllEmployees()

Class EmployeeDAOMySQLImpl
Interface EmployeeService
- addEmployee(Employee e)
- deleteEmployee(int id)
- updateEmployee(Employee e)
- findEmployee(Employee e)
- showAllEmployees()
