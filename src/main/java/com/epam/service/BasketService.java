package com.epam.service;

import com.epam.entity.Ball;
import com.epam.entity.BallType;
import com.epam.entity.Basket;
import com.epam.entity.Color;

public class BasketService {

    public boolean kickBall(Basket basket, Ball ball) {
        if (ball != null) {
            basket.addBall(ball);
            return true;
        }

        return false;
    }

    public Ball getBall(Basket basket) {
        Ball ball = basket.getBall();

        if (ball != null) {
            basket.removeBall(ball);
            return ball;
        } else {
            return null;
        }
    }

    public Ball getBallByColor(Basket basket, Color color) {
        Ball ballWithColor;

        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == color) {
                ballWithColor = ball;
                basket.removeBall(ball);
                return ballWithColor;
            }
        }

        return null;
    }

    public double getBasketWeight(Basket basket) {
        double weight = 0;

        for (Ball ball : basket.getBalls()) {
            weight += ball.getWeight();
        }

        return weight;
    }

    public int getBallCountByColor(Basket basket, Color color) {
        int ballCountByColor = 0;

        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == color) {
                ballCountByColor++;
            }
        }

        return ballCountByColor;
    }

    public Ball getBallByBallType(Basket basket, BallType ballType) {
        Ball ballWithType;

        for (Ball ball : basket.getBalls()) {
            if (ball.getBallType() == ballType) {
                ballWithType = ball;
                basket.removeBall(ball);
                return ballWithType;
            }
        }

        return null;
    }

    public int getBallCount(Basket basket){
        int ballCount = 0;

        for(Ball ball: basket.getBalls()){
            ballCount++;
        }

        return ballCount;
    }
}
