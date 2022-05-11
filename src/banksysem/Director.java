package banksysem;
public class Director extends Employee {
 

    public Director(String firstname, String lastname, int salary) {
        super(firstname, lastname, salary, 0);
    }

    @Override
    public void printInfo(){
        System.out.println(firstname + " " + lastname + " " + getSalary());
    }
}
