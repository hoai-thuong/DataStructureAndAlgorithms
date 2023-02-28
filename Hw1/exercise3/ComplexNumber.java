package Hw1.exercise3;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public static void main(String[] args) {
        ComplexNumber cm1 = new ComplexNumber(1, 2);
        ComplexNumber cm2 = new ComplexNumber(3, 4);
        ComplexNumber cm3 = new ComplexNumber(5, 6);
        System.out.println("\nso thu nhat: ");
        cm1.showC();
        System.out.println("\nso thu hai: ");
        cm2.showC();
        System.out.println("\nso thu ba: ");
        cm3.showC();
        System.out.println("\ntong cua so thu nhat va so thu 2: ");

        add(cm1, cm2).showC();
        System.out.println("\ntich cua so thu nhat va so thu hai: ");
        mul(cm1, cm2).showC();
        System.out.println("\ntong cua ca ba so: ");
        add(cm1, cm2).add(cm3).showC();
        System.out.println("\ntich cua ca ba so: ");
        mul(cm1, cm2).mul(cm3).showC();
    }

    public void showC() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    private static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.real + b.real, a.imaginary + b.imaginary);
    }

    private static ComplexNumber mul(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber((a.real * b.real) - (a.imaginary * b.imaginary), (a.imaginary * b.real) + (a.real * b.imaginary));
    }

    public final ComplexNumber add(ComplexNumber c) {
        return add(this, c);
    }

    public final ComplexNumber mul(ComplexNumber c) {
        return mul(this, c);
    }

}