public class Bank {

    String title;
    String address;
    Director director;
    Employee employee;
    
    public Bank(String title,  String address, Director director, Employee employee) {
       this.title = title;
       this.address = address;
       this.director = director;
       this.employee = employee;
    }

    public void printInformation() {
        System.out.println(title + " <> " + address);
    }

    public void whoIsDirector() {
        director.printInformation();
    }

    public void whoIsEmployee() {
        employee.printEmployeeInfo();
    }
    
    public static void main(String[] args) {
        Director director = new Director("Ivan", "Ivanov", 100_000);
        Employee employee = new Employee("Morozov", "Alexey", 50_000, 1);
        
        Bank bank = new Bank("Sberbank", "Moscow", director, employee);
        
        bank.whoIsDirector();
        bank.printInformation();
        bank.whoIsEmployee();

        Bank bank1 = new Bank("VTB", "Ulyanovsk", director, employee);
        bank1.printInformation();
    }
}
