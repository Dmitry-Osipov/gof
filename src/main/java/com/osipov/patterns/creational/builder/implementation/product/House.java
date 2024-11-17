package com.osipov.patterns.creational.builder.implementation.product;

public class House {
    private String walls;
    private String roof;
    private String foundation;

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getWalls() {
        return walls;
    }

    public String getRoof() {
        return roof;
    }

    public String getFoundation() {
        return foundation;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
