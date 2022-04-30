public class Director {
    String firstname;
    String lastname;
    int salary;

    public Director(String firstname, String lastname, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public void printInformation(){
        System.out.println(firstname + " " + lastname + " " + salary);
    }
}
