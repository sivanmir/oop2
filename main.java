public class main {
    public static void main(String[] args) {
        Employee Emp1= new Employee("sivan","mir", 8000.0, 5, 322555255);
        Employee Emp2= new Employee("rotem" , "mir" , 10000.0, 1,25546535);
        Employee Emp3 = new Employee("irit", "mir", 20000.0, 3, 3554685);

        Emp1.ChangeFloor(4);
        Emp1.RaiseUpSalary(50000.0);

        Emp2.ChangeFloor(6);
        Emp2.RaiseUpSalary(200000.0);

        Emp3.ChangeFloor(2);
        Emp3.RaiseUpSalary(90000.0);

    }
}
