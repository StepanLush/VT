package LAB1.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
    @Test
    public void testBasket() {
        Ball ball1 = new Ball("red", 0.2);
        Ball ball2 = new Ball("blue", 0.3);
        Ball ball3 = new Ball("blue", 0.25);

        Basket basket = new Basket();
        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);

        double totalWeightOfBalls = basket.getTotalWeightOfBalls();
        int numberOfBlueBalls = basket.getNumberOfBlueBalls();

        assertEquals(0.75, totalWeightOfBalls, 0.01);

        assertEquals(2, numberOfBlueBalls);
    }

    @Test
    public void testBall() {
        Ball ball = new Ball("red", 0.2);

        assertEquals("red", ball.getColor());

        assertEquals(0.2, ball.getWeight(), 0.01);
    }
}