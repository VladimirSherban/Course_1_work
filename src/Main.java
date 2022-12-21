public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Соколова Ева Николаевна", 2, 25000);
        employees[1] = new Employee("Савин Илья Львович", 3, 27000);
        employees[2] = new Employee("Герасимов Роман Леонидович", 1, 25000);
        employees[3] = new Employee("Тихонов Руслан Алексеевич", 5, 40000);
        employees[4] = new Employee("Андреева Екатерина Никитична", 4, 65000);
        employees[5] = new Employee("Кузнецова Анастасия Павловна", 1, 20000);
        employees[6] = new Employee("Сидоров Арсений Денисович", 1, 47000);
        employees[7] = new Employee("Масленников Артём Викторович", 2, 35000);
        employees[8] = new Employee("Романов Иван Александрович", 3, 25000);
        employees[9] = new Employee("Горшкова Кира Константиновна", 5, 27000);

        FunctionalEmployee.printEmployees(employees);
        Separator.separator();
        FunctionalEmployee.costSalaryMonth(employees);
        Separator.separator();
        FunctionalEmployee.findMinSalary(employees);
        Separator.separator();
        FunctionalEmployee.findMaxSalary(employees);
        Separator.separator();
        FunctionalEmployee.averageValueOFSalaryMonth(employees);
        Separator.separator();
        FunctionalEmployee.printNameAllEmployees(employees);
        Separator.separator();
        FunctionalEmployee.findMinSalaryInDepartment(employees,5);
        Separator.separator();
        FunctionalEmployee.findMaxSalaryInDepartment(employees,1);
        Separator.separator();
        FunctionalEmployee.costSalaryMonthInDepartment(employees,2);
        Separator.separator();
        FunctionalEmployee.indexSalary(employees,1.0839);
        Separator.separator();
        FunctionalEmployee.indexSalaryInDepartment(employees,1.0839,3);
        Separator.separator();
        FunctionalEmployee.showDepartmentEmployees(employees,2);
        Separator.separator();
        FunctionalEmployee.findEmployeeWithSalaryLessNumber(employees,28000);
        Separator.separator();
        FunctionalEmployee.findEmployeeWithSalaryMoreNumber(employees,28000);
        Separator.separator();
        FunctionalEmployee.findAverageSalaryDepartment(employees,3);
        
    }
}