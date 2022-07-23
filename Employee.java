public class Employee {
    String firstNAme;
    String lastName;
    double salary;
    int floor;
    int ID;

    public Employee(String firstNAme, String lastName, double salary, int floor, int ID) {
        this.firstNAme = firstNAme;
        this.lastName = lastName;
        this.salary = salary;
        this.floor = floor;
        this.ID = ID;
    }

    public void RaiseUpSalary(double raise){
        this.salary= raise;

        System.out.println("Employee ID: " + this.ID + " salary has been changed to: " + this.salary );
    }

    public void ChangeFloor(int Floor){
        this.floor= Floor;
        System.out.println("Employee ID: " + this.ID + " floor has been changed to: " + this.floor );
    }

    public String toString(){
        return "ID: "+ this.ID+ " Full name: " + this.firstNAme + " "+ this.lastName + " salary: "+ this.salary+ " floor number: " + this.floor;
    }
}
