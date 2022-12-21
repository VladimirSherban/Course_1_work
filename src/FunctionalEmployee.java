import java.util.Arrays;

public class FunctionalEmployee {

    static void printEmployees(Employee[] employees) {
        System.out.println((Arrays.toString(employees)));
    }

    static void costSalaryMonth(Employee[] employees) {
        int totalCostMonth = 0;
        for (Employee employee : employees) {
            totalCostMonth += employee.getSalary();
        }
        System.out.println("Сумма затрать на зарплату сотрудников в месяц = " + totalCostMonth);
    }

    static void findMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = new Employee(" ", 0, 6000000);
        for (Employee employee : employees) {
            if (employeeWithMinSalary.getSalary() > employee.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + employeeWithMinSalary);
    }

    static void findMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = new Employee(" ", 0, 0);
        for (Employee employee : employees) {
            if (employeeWithMaxSalary.getSalary() < employee.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + employeeWithMaxSalary);
    }

    static void averageValueOFSalaryMonth(Employee[] employees) {
        double totalCostMonth = 0;
        for (Employee employee : employees) {
            totalCostMonth += employee.getSalary();
        }
        totalCostMonth /= employees.length;
        System.out.println("Среднее значение зарплат всех содрудников = " + totalCostMonth);
    }

    static void printNameAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.print("{" + employee.getName() + "}" + " ");
        }
        System.out.println();
    }

    static void indexSalary(Employee[] employees, double index) {
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * index));
        }
        System.out.println("С учетом индексации на " + index + "%" + " зарплата станет следующей " + Arrays.toString(employees));
    }

    static void findMinSalaryInDepartment(Employee[] employees, int numberDepartment) {
        Employee employeeWithMinSalary = new Employee(" ", 0, 6000000);
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                if (employeeWithMinSalary.getSalary() > employee.getSalary()) {
                    employeeWithMinSalary = employee;
                }
            }
        }
        System.out.println("Сотрудник с самой маленькой зарплатой в департаменте №" + numberDepartment + " является " + employeeWithMinSalary);
    }

    static void findMaxSalaryInDepartment(Employee[] employees, int numberDepartment) {
        Employee employeeWithMaxSalary = new Employee(" ", 0, 0);
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                if (employeeWithMaxSalary.getSalary() < employee.getSalary()) {
                    employeeWithMaxSalary = employee;
                }
            }
        }
        System.out.println("Сотрудник с самой большой зарплатой в департаменте №" + numberDepartment + " является " + employeeWithMaxSalary);
    }

    static void costSalaryMonthInDepartment(Employee[] employees, int numberDepartment) {
        int totalCostMonth = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                totalCostMonth += employee.getSalary();
            }
        }
        System.out.println("Сумма затрать на зарплату по отделу №" + numberDepartment + " в месяц = " + totalCostMonth);
    }

    static void indexSalaryInDepartment(Employee[] employees, double index, int numberDepartment) {
        System.out.println("С учетом индексации на " + index + "%" + " зарплата в департаменте №" + numberDepartment
                + " станет следующей: ");
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                employee.setSalary((int) (employee.getSalary() * index));
                System.out.println(employee);
            }
        }
    }

    static void showDepartmentEmployees(Employee[] employees, int numberDepartment) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                System.out.print("{Имя = " + employee.getName() + ", зарплата = " + employee.getSalary() + ", id = "
                        + employee.getId() + "}");
            }
        }
        System.out.println();
    }

    static void findEmployeeWithSalaryLessNumber(Employee[] employees, int salary) {
        System.out.println("Сотрудники с зарплатой меньше чем " + salary);
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.print("{Имя = " + employee.getName() + ", зарплата = " + employee.getSalary() + " id = " +
                        employee.getId() + "}");
            }
        }
        System.out.println();
    }

    static void findEmployeeWithSalaryMoreNumber(Employee[] employees, int salary) {
        System.out.println("Сотрудники с зарплатой больше, либо равной  " + salary);
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.print("{Имя = " + employee.getName() + ", зарплата = " + employee.getSalary() + " id = " +
                        employee.getId() + "}");
            }
        }
        System.out.println();
    }

    static void findAverageSalaryDepartment(Employee[] employees, int numberDepartment) {
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
}
