import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String title;
    private String address;
    private Director director;
    private Employee employee;
    private List<Employee> employeesList;
    private List<Client> clientsList;
    
    
    public Bank(String title,  String address, Director director) {
       this.title = title;
       this.address = address;
       this.director = director;
       this.employeesList = new ArrayList<>();
       this.clientsList = new ArrayList<>();
    }

    public void addClients(String firstname, String lastname, int id) {
         Client client = new Client(firstname, lastname, id);
         clientsList.add(client);
    }

    public void setNewSalary(int employeeId, int newSalary) {
        
         for (int i = 0; i < employeesList.size(); i++){
            Employee employee = employeesList.get(i);
            if (employee.id == employeeId) {
                employee.setSalary(newSalary);
                break;
            }
         }   
    }

    public void printClients() {
        for (int i = 0; i < clientsList.size(); i++) {
            Client client = clientsList.get(i);
            client.printInfo();
        }
    }

    public void addEmployee(String firstname, String lastname, int salary, int id) {
        Employee employee = new Employee(firstname, lastname, salary, id);
        employeesList.add(employee);
    }

    public void printEmployees() {
        for (int i = 0; i < employeesList.size(); i++) {
            Employee  employee = employeesList.get(i);
            employee.printInfo();
        }
    }

    public void printInformation() {
        System.out.println(title + " <> " + address);
    }

    public void whoIsDirector() {
        director.printInfo();
    }
 
  
}
