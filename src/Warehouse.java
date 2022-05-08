import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    String name;
    String address;
    List<Worker> workersList;
    List<Cargo> cargoList;

    public Warehouse(String name, String address) {
        this.name = name;
        this.address = address;
        this.workersList = new ArrayList<>();
        this.cargoList = new ArrayList<>();
    }

    public void addWorker(String name, String surname, int salary) {
        Worker newWorker = new Worker(name, surname, salary);
        workersList.add(newWorker);
    }

    public void addCargo(String name, String startPoint, String finishPoint, int weight) {
        Cargo newCargo = new Cargo(name, startPoint, finishPoint, weight);
        cargoList.add(newCargo);
    }

    public void printWorkers() {
        for(int i = 0; i < workersList.size(); i++) {
            Worker worker = workersList.get(i);
            worker.printInfo();
        }
    }

    public void printCargo() {
        for(int i = 0; i < cargoList.size(); i++) {
            Cargo cargo = cargoList.get(i);
            cargo.printInfo();
        }
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("Sklad", "Moscow");

        warehouse.addWorker("Ivan", "Petrov", 10_000);
        warehouse.addWorker("Petr", "Ivanov", 10_000);
        warehouse.printWorkers();

        warehouse.addCargo("Products", "Moscow", "Samara", 15);
        warehouse.addCargo("Details", "Samara", "Moscow", 20);
        warehouse.printCargo();
    }
}
