public class Employee extends Person {
  
    private int salary;
    

    public Employee(String firstname, String lastname, int salary, int id) {
        super(firstname, lastname, id);
        this.salary = salary;
        
    }

    public void printInfo() {
        System.out.println(id + " " + firstname + " " + lastname + " " + salary);
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public int getSalary() {
        return salary;
    }

}
