package Hw3_21002177.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Complex {
    private float real;   // the real part
    private float image;   // the imaginary part

    // create a new object with the given real and imaginary parts
    public Complex(float r, float i) {
        real = r;
        image = i;
    }

    public Complex() {
    }

    public Complex plus(Complex c) {
        Complex a = this;             // invoking object
        float real = a.real + c.real;
        float imag = a.image + c.image;
        return new Complex(real, imag);
    }

    // return a new Complex object whose value is (this - b)
    public Complex minus(Complex c) {
        Complex a = this;
        float real = a.real - c.real;
        float imag = a.image - c.image;
        return new Complex(real, imag);
    }

    public Complex times(Complex c) {

        float real = this.real * c.real - this.image * c.image;
        float imag = this.real * c.image + this.image * c.real;
        return new Complex(real, imag);
    }

    public Complex mulTimes(ArrayList<Complex> list) {
        Complex number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            number = number.times(list.get(i));
        }
        return number;
    }

    public float realpart() {
        return real;
    }

    public float imagepart() {
        return image;
    }


    // return a string representation of the invoking Complex object
    public String toString() {
        if (image == 0) return real + "";
        if (real == 0) return image + "i";
        if (image < 0) return real + " - " + (-image) + "i";
        return real + " + " + image + "i";
    }


}