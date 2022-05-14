package pool;

import banksystem.Bank;

public class Pool {
    double length;
    double width;
    Ball ball;

    public Pool(double length, double width, Ball ball) {
        this.length = length;
        this.width = width;
        this.ball = ball;
    }

    public void printSize() {
        System.out.println("length: " + length + " width: " + width);
    }

    public static void main(String[] args) {
    	Ball ball = new Ball(0, 0);
        Pool pool = new Pool(2.5, 1.5, ball);
        pool.printSize();      
        ball.up();
        ball.down();
        ball.right();
        ball.left();
        ball.freeMovement(6, 6);
   }
}
