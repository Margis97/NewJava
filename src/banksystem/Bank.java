package banksystem;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {

	private String title;
	private String address;
	private Director director;
	private Employee employee;
	private List<Employee> employeesList;
	private List<Client> clientsList;
	private List<BankProduct> bankProducts; //extra list for print all bankproducts all clients


	public Bank(String title,  String address, Director director) {
		this.title = title;
		this.address = address;
		this.director = director;
		this.employeesList = new ArrayList<>();
		this.clientsList = new ArrayList<>();
		this.bankProducts = new ArrayList<>();
	}

	public void addClients(String firstname, String lastname, int id) {
		Client client = new Client(firstname, lastname, id);
		clientsList.add(client);
	}

	public void openAccount(int clientId, int accountId, String accountTitle, int amount) {
		for (int i = 0; i < clientsList.size(); i++){
			Client client = clientsList.get(i);
			if (client.id == clientId) {
				Account account = new Account(accountId, accountTitle, amount);
				client.addBankProduct(account);
				this.bankProducts.add(account);
				break;
			}
		}   
	}

	public void printAllAccounts() {   
		for(BankProduct b : bankProducts) {
			b.printInformationAboutProduct();
		}
	}

	public void openCredit(int clientId, int creditId, String creditTitle, int amount) {
		for (int i = 0; i < clientsList.size(); i++){
			Client client = clientsList.get(i);
			if (client.id == clientId) {
				Credit credit = new Credit(creditId, creditTitle, amount);
				client.addBankProduct(credit);
				this.bankProducts.add(credit);
				break;
			}
		}   
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
