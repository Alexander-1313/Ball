package com.epam.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public Ball getBall() {
        return balls.get(0);
    }

    public List<Ball> getBalls(){
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public void removeBall(Ball ball){
        balls.remove(ball);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Basket basket = (Basket) o;

        return balls != null ? balls.equals(basket.balls) : basket.balls == null;
    }

    @Override
    public int hashCode() {
        return balls != null ? balls.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Basket{");
        sb.append("balls=").append(balls);
        sb.append('}');
        return sb.toString();
    }
}
