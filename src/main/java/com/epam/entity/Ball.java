package com.epam.entity;

public class Ball {

    private double weight;
    private Color color;
    private BallType ballType;

    public Ball() {
    }

    public Ball(double weight, Color color, BallType ballType) {
        this.weight = weight;
        this.color = color;
        this.ballType = ballType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (Double.compare(ball.weight, weight) != 0) return false;
        if (color != ball.color) return false;
        return ballType == ball.ballType;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (ballType != null ? ballType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("weight=").append(weight);
        sb.append(", color=").append(color);
        sb.append(", ballType=").append(ballType);
        sb.append('}');
        return sb.toString();
    }
}
