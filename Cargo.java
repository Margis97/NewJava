public class Cargo {
    String name;
    String startPoint;
    String finishPoint;
    int weight;

    public Cargo(String name, String startPoint, String finishPoint, int weight) {
        this.name = name;
        this.startPoint = startPoint;
        this.finishPoint = finishPoint;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println(name + " " + startPoint + " " + finishPoint + " " + weight);
    }
}
