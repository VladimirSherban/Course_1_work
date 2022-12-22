import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

public class EmployeeBook {
    private int sizeBook = 10;
    private final Employee[] employees = new Employee[sizeBook];

    public void setSizeBook(int sizeBook) {
        this.sizeBook = sizeBook;
    }

    void addEmployee(Employee employee) {
        int index = -1;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                index = i;
                break;
            }
        }

        if (index < 0) {
            System.out.println("Справочник уже заполнен!");
            return;
        }
        employees[index] = employee;
        System.out.println("Добавлен сотрудник - " + employee.getName());
    }

    void printEmployees() {
        System.out.println((Arrays.toString(employees)));
    }

    void updateEmployeeSalary(String FIO, int salary) {
        for (Employee employee : employees) {
            if (Objects.equals(employee.getName(), FIO)) {
                if (employee.getSalary() == salary) {
                    System.out.println("Зарплата сотрудника " + FIO + " и так = " + salary);
                } else {
                    System.out.print("Зарплата сотрудника " + FIO + " изменена c " + employee.getSalary());
                    employee.setSalary(salary);
                    System.out.println(" на " + employee.getSalary());
                }
            }
        }
    }

    void updateEmployeeDepartment(String FIO, int department) {

        for (Employee employee : employees)
            if (Objects.equals(employee.getName(), FIO)) {
                if (department == employee.getDepartment()) {
                    System.out.println("Департамент сотрудника " + FIO + " и так является №" + department);
                } else {
                    System.out.print("Отдел сотрудника " + FIO + " изменен с " + employee.getDepartment());
                    employee.setDepartment(department);
                    System.out.println(" на " + employee.getDepartment());
                }
            }
    }

    void delEmployee(int id) {
        boolean notExist = true;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Был удален сотрудник - " + employees[i].getName());
                employees[i] = null;
                notExist = false;
            }
        }

        if (notExist) {
            System.out.println("Этот сотрудник был удален ранее.");
        }
    }

    void costSalaryMonth() {
        int totalCostMonth = 0;
        for (Employee employee : employees) {
            totalCostMonth += employee.getSalary();
        }
        System.out.println("Сумма затрать на зарплату сотрудников в месяц = " + totalCostMonth);
    }

    void findMinSalary() {
//        Employee employeeWithMinSalary = new Employee(" ", 0, 6000000);                // Метод без стримов
//        for (Employee employee : employees) {
//            if (employeeWithMinSalary.getSalary() > employee.getSalary()) {
//                employeeWithMinSalary = employee;
//            }
//        }

        Optional<Employee> employeeWithMin = Arrays.stream(employees).min(Comparator.comparing(Employee::getSalary));

        System.out.println("Сотрудник с минимальной зарплатой " + employeeWithMin.get());
    }

    void findMaxSalary() {
//        Employee employeeWithMaxSalary = new Employee(" ", 0, 0);                   // Метод без стримов
//        for (Employee employee : employees) {
//            if (employeeWithMaxSalary.getSalary() < employee.getSalary()) {
//                employeeWithMaxSalary = employee;
//            }
//        }

        Optional<Employee> employeeWithMax = Arrays.stream(employees).max(Comparator.comparing(Employee::getSalary));

        System.out.println("Сотрудник с максимальной зарплатой " + employeeWithMax);
    }

    void averageValueOFSalaryMonth() {
        double totalCostMonth = 0;
        for (Employee employee : employees) {
            totalCostMonth += employee.getSalary();
        }
        totalCostMonth /= employees.length;
        System.out.println("Среднее значение зарплат всех содрудников = " + totalCostMonth);
    }

    void printNameAllEmployees() {
        for (Employee employee : employees) {
            System.out.print("{" + employee.getName() + "}" + " ");
        }
        System.out.println();
    }

    void indexSalary(double index) {
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * index));
        }
        System.out.println("С учетом индексации на " + index + "%" + " зарплата станет следующей " + Arrays.toString(employees));
    }

    void findMinSalaryInDepartment(int numberDepartment) {
//        Employee employeeWithMinSalary = new Employee(" ", 0, 6000000);                      //метод без стримов
//        for (Employee employee : employees) {
//            if (employee.getDepartment() == numberDepartment
//                    && employeeWithMinSalary.getSalary() > employee.getSalary()) {
//
//                employeeWithMinSalary = employee;
//            }
//        }

        Optional<Employee> employeeWithMin = Arrays.stream(employees)
                .filter(employee -> employee.getDepartment() == numberDepartment)
                .min(Comparator.comparing(Employee::getSalary));

        System.out.println("Сотрудник с самой маленькой зарплатой в департаменте №" + numberDepartment + " является " + employeeWithMin);
    }

    void findMaxSalaryInDepartment(int numberDepartment) {
//        Employee employeeWithMaxSalary = new Employee(" ", 0, 0);                       //метод без стримов
//        for (Employee employee : employees) {
//            if (employee.getDepartment() == numberDepartment) {
//                if (employeeWithMaxSalary.getSalary() < employee.getSalary()) {
//                    employeeWithMaxSalary = employee;
//                }
//            }
//        }

        Optional<Employee> employeeWithMax = Arrays.stream(employees)
                .filter(employee -> employee.getDepartment() == numberDepartment)
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println("Сотрудник с самой большой зарплатой в департаменте №" + numberDepartment + " является " + employeeWithMax);
    }

    void costSalaryMonthInDepartment(int numberDepartment) {
        int totalCostMonth = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                totalCostMonth += employee.getSalary();
            }
        }
        System.out.println("Сумма затрать на зарплату по отделу №" + numberDepartment + " в месяц = " + totalCostMonth);
    }

    void indexSalaryInDepartment(double index, int numberDepartment) {
        System.out.println("С учетом индексации на " + index + "%" + " зарплата в департаменте №" + numberDepartment
                + " станет следующей: ");
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                employee.setSalary((int) (employee.getSalary() * index));
                System.out.println(employee);
            }
        }
    }

    void showDepartmentEmployees(int numberDepartment) {
        System.out.println("Сотрудники департамента №" + numberDepartment);
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                System.out.print("{Имя = " + employee.getName() + ", зарплата = " + employee.getSalary() + ", id = "
                        + employee.getId() + "}");
            }
        }
        System.out.println();
    }

    void findEmployeeWithSalaryLessNumber(int salary) {
        System.out.println("Сотрудники с зарплатой меньше чем " + salary);
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.print("{Имя = " + employee.getName() + ", зарплата = " + employee.getSalary() + " id = " +
                        employee.getId() + "}");
            }
        }
        System.out.println();
    }

    void findEmployeeWithSalaryMoreNumber(int salary) {
        System.out.println("Сотрудники с зарплатой больше, либо равной  " + salary);
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.print("{Имя = " + employee.getName() + ", зарплата = " + employee.getSalary() + " id = " +
                        employee.getId() + "}");
            }
        }
        System.out.println();
    }

    void findAverageSalaryDepartment(int numberDepartment) {
        double totalCostMonth = 0;
        int counterEmployee = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                totalCostMonth += employee.getSalary();
                counterEmployee++;
            }
        }
        totalCostMonth /= counterEmployee;
        System.out.println("Среднее значение зарплат по отделу №" + numberDepartment + " = " + totalCostMonth);
    }

    void printDepartmentEmployees() {
        methodForPrintDepartmentEmployees(1);

        methodForPrintDepartmentEmployees(2);
        methodForPrintDepartmentEmployees(3);
        methodForPrintDepartmentEmployees(4);
        methodForPrintDepartmentEmployees(5);

    }

    private void methodForPrintDepartmentEmployees(int dep) {
        StringBuilder dep1 = new StringBuilder();
        for (Employee employee : employees) {
            if (employee.getDepartment() == dep) {
                dep1.append(employee.getName()).append("; ");
            }
        }
        System.out.println("Сотрудники департамента №" + dep + ": " + dep1);
    }
}
