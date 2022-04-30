public class Employee {
    String firstname;
    String lastname;
    int salary;
    int id;

    public Employee(String firstname, String lastname, int salary, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.id = id;
    }

    public void printEmployeeInfo() {
        System.out.println(id + " " + firstname + " " + lastname + " " + salary);
    }
}
