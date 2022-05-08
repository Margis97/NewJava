import java.util.ArrayList;

public class BankMain {
    
    public static void main(String[] args) {
        Director director = new Director("Ivan", "Ivanov", 100_000);
        Employee employee = new Employee("Morozov", "Alexey", 50_000, 1);
        
        Bank bank = new Bank("Sberbank", "Moscow", director);
        bank.whoIsDirector();
        bank.printInformation();
        bank.addEmployee("Morozov", "Alexey", 50_000, 1);
        bank.addEmployee("Knazeva", "Sofia", 55_0000, 2);
        //bank.employeesList  = new ArrayList<>();
        //bank.employeesList.get(0).salary = -55_000;
        bank.setNewSalary(1, -55_000);
        bank.printEmployees();
        bank.addClients("firstname", "lastname", 1);
        bank.printClients();
        // Person person = new Person(""," lastname", 3);
        Bank bank1 = new Bank("VTB", "Ulyanovsk", director);
        bank1.printInformation();
    }
}
