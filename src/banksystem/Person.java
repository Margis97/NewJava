package banksystem;


public abstract class Person {
    String firstname;
    String lastname;
    int id;


    public Person(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }
 
    public void printInfo() {
        System.out.println(id + " " + firstname + " " + lastname + " ");
    }
    
}
