package Hw3_21002177.ex2;

//Tạo đối tượng Shape
public abstract class Shape {
    protected String name;

    protected abstract double getVolume();

    protected abstract double getArea();

    protected abstract double getPerimeter();

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }
}