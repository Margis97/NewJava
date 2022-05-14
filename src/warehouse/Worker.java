package warehouse;
public class Worker {
    String name;
    String surname;
    int salary;

    public Worker(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(name + " " + surname + " " + salary);
    }
}
