package poolsystem;
public class Ball {

    int x;
    int y;
    
    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void up() {
        System.out.println("move up");
    }

    public void down() {
        System.out.println("move down");
    }

    public void right() {
        System.out.println("move right");
    }

    public void left() {
        System.out.println("move left");
    }

    public void freeMovement(int m, int n) {
        System.out.println("final point is " + m + ";" + n);
    }
} 
