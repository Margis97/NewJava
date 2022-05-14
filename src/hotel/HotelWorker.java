package hotel;
public class HotelWorker {
    String name;
    String surname;
    int salary;

    public HotelWorker(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(name + " " + surname + " " + salary);
    }
}
