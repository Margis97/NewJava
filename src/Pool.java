public class Pool {
    double length;
    double width;

    Pool(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void printSize() {
        System.out.println("length: " + length + " width: " + width);
    }

    public static void main(String[] args) {
        Pool pool = new Pool(2.5, 1.5);
        pool.printSize();
        Ball ball = new Ball(0, 0);
        ball.up();
        ball.down();
        ball.right();
        ball.left();
        ball.freeMovement(6, 6);
   }
}
