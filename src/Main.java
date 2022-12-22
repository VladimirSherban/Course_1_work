public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee(new Employee("Соколова Ева Николаевна", 2, 25000));
        employeeBook.addEmployee(new Employee("Савин Илья Львович", 3, 27000));

        employeeBook.addEmployee(new Employee("Герасимов Роман Леонидович", 1, 25000));
        employeeBook.addEmployee(new Employee("Тихонов Руслан Алексеевич", 5, 40000));

        employeeBook.addEmployee(new Employee("Андреева Екатерина Никитична", 4, 65000));
        employeeBook.addEmployee(new Employee("Кузнецова Анастасия Павловна", 4, 20000));

        employeeBook.addEmployee(new Employee("Сидоров Арсений Денисович", 1, 47000));
        employeeBook.addEmployee(new Employee("Масленников Артём Викторович", 2, 35000));

        employeeBook.addEmployee(new Employee("Романов Иван Александрович", 3, 25000));
        employeeBook.addEmployee(new Employee("Горшкова Кира Константиновна", 5, 27000));


        employeeBook.printEmployees();
        Separator.separator();
        employeeBook.costSalaryMonth();
        Separator.separator();
        employeeBook.findMinSalary();
        Separator.separator();
        employeeBook.findMaxSalary();
        Separator.separator();
        employeeBook.averageValueOFSalaryMonth();
        Separator.separator();
        employeeBook.printNameAllEmployees();
        Separator.separator();
        employeeBook.findMinSalaryInDepartment(2);
        Separator.separator();
        employeeBook.findMaxSalaryInDepartment(3);
        Separator.separator();
        employeeBook.costSalaryMonthInDepartment(4);
        Separator.separator();
        employeeBook.findAverageSalaryDepartment(5);
        Separator.separator();
        employeeBook.indexSalary(1.083);
        Separator.separator();
        employeeBook.showDepartmentEmployees(4);
        Separator.separator();
        employeeBook.updateEmployeeSalary("Горшкова Кира Константиновна", 30000);
        Separator.separator();
        employeeBook.updateEmployeeSalary("Романов Иван Александрович", 25000);
        Separator.separator();
        employeeBook.updateEmployeeDepartment("Сидоров Арсений Денисович", 2);
        Separator.separator();
        employeeBook.updateEmployeeDepartment("Масленников Артём Викторович", 2);
        Separator.separator();
        employeeBook.printDepartmentEmployees();
        Separator.separator();
        employeeBook.delEmployee(0);
        Separator.separator();
        employeeBook.printEmployees();
        Separator.separator();
        employeeBook.addEmployee(new Employee("Вася пупкин", 4, 10000));
        Separator.separator();
        employeeBook.printEmployees();
        employeeBook.delEmployee(0);
    }
}
