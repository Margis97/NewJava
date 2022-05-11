import java.util.ArrayList;
import java.util.List;

public class Hotel {

    List<HotelWorker> hotelWorkersList;

    public Hotel() {
        this.hotelWorkersList = new ArrayList<>();
    }

    public void addHotelWorker(String name, String surname, int salary) {
        HotelWorker newHotelWorker = new HotelWorker(name, surname, salary);
        hotelWorkersList.add(newHotelWorker);       
    }

    public void printInfo() {
        for(int i = 0; i < hotelWorkersList.size(); i++) {
            HotelWorker hotelWorker = hotelWorkersList.get(i);
            hotelWorker.printInfo();
        }
    }
        public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.addHotelWorker("Elena", "Ivanova", 25_000);
        hotel.addHotelWorker("Anna", "Petrova", 20_000);
        hotel.printInfo();
    }
}