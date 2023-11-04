package LAB1.task9;

import java.util.ArrayList;
import java.util.List;

class Ball {
    private String color;
    private double weight;

    public Ball(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
}

class Basket {
    private List<Ball> balls = new ArrayList<>();

    public Basket() {
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public double getTotalWeightOfBalls() {
        double weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getNumberOfBlueBalls() {
        int count = 0;
        for (Ball ball : balls) {
            if (ball.getColor().equalsIgnoreCase("blue")) {
                count++;
            }
        }
        return count;
    }
}

public class Task9 {
    public static void main(String[] args) {
        Ball ball1 = new Ball("red", 0.2);
        Ball ball2 = new Ball("blue", 0.3);
        Ball ball3 = new Ball("blue", 0.25);

        Basket basket = new Basket();
        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);

        double totalWeightOfBalls = basket.getTotalWeightOfBalls();
        int numberOfBlueBalls = basket.getNumberOfBlueBalls();

        System.out.println("Total weight of balls in the basket: " + totalWeightOfBalls + " kg");
        System.out.println("Number of blue balls in the basket: " + numberOfBlueBalls);
    }
}
