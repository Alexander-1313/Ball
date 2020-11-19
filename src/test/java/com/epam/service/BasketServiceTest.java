package com.epam.service;

import com.epam.entity.Ball;
import com.epam.entity.BallType;
import com.epam.entity.Basket;
import com.epam.entity.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class BasketServiceTest {

    List<Ball> balls;
    BasketService service = new BasketService();
    Basket basket;

    @BeforeMethod
    public void createBalls() {
        balls = new ArrayList<Ball>();

        basket = new Basket(balls);
    }

    @Test
    public void testKickBall() {

        boolean actual = service.kickBall(basket, new Ball(1, Color.RED, BallType.BASKETBALL));

        assertTrue(actual);
    }

    @Test
    public void testGetBall() {
        Ball expected = new Ball(1, Color.RED, BallType.FOOTBALL);

        service.kickBall(basket, expected);

        Ball actual = service.getBall(basket);

        assertEquals(actual, expected);
    }

    @Test
    public void testGetBallByColor() {

        Ball expected = new Ball(1, Color.RED, BallType.FOOTBALL);

        service.kickBall(basket, expected);

        Ball actual = service.getBallByColor(basket, Color.RED);

        assertEquals(actual, expected);
    }

    @Test
    public void testGetBasketWeight() {

        Ball ball = new Ball(1, Color.RED, BallType.FOOTBALL);

        service.kickBall(basket, ball);

        double actual = service.getBasketWeight(basket);

        double expected = 1;

        assertEquals(actual, expected, 0.0001);
    }

    @Test
    public void testGetBallCountByColor() {

        service.kickBall(basket, new Ball(1.2, Color.GREEN, BallType.BASKETBALL));
        service.kickBall(basket, new Ball(1.2, Color.BLUE, BallType.BASKETBALL));

        int actual = service.getBallCountByColor(basket, Color.GREEN);

        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void testGetBallByBallType() {

        Ball expected = new Ball(1, Color.RED, BallType.FOOTBALL);

        service.kickBall(basket, expected);

        Ball actual = service.getBallByBallType(basket, BallType.FOOTBALL);

        assertEquals(actual, expected);
    }

    @Test
    public void testGetBallCount() {

        service.kickBall(basket, new Ball(1.2, Color.GREEN, BallType.BASKETBALL));
        service.kickBall(basket, new Ball(1.2, Color.BLUE, BallType.BASKETBALL));

        int actual = service.getBallCount(basket);

        int expected = 2;

        assertEquals(actual, expected);
    }
}