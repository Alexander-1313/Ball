package com.epam.runner;

import com.epam.entity.Ball;
import com.epam.entity.BallType;
import com.epam.entity.Basket;
import com.epam.entity.Color;
import com.epam.service.BasketService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BasketService service = new BasketService();

        List<Ball> balls = new ArrayList<>();

        Basket basket = new Basket(balls);

        System.out.println("service.getBallCount(basket) = " + service.getBallCount(basket));

        service.kickBall(basket, new Ball(3.6, Color.BLUE, BallType.VOLLEYBALL));

        System.out.println("service.getBallCount(basket) = " + service.getBallCount(basket));

        Ball ballByColor = service.getBallByColor(basket, Color.GREEN);
        service.kickBall(basket, ballByColor);

        System.out.println(service.calculateBasketWeight(basket));
    }
}
