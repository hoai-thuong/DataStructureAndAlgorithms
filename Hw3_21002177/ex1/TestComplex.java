package Hw3_21002177.ex1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Complex> list = new ArrayList<>();
        System.out.print("List contains: ");
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            Random rd = new Random();
            float real = rd.nextFloat();
            float imag = rd.nextFloat();
            Complex number = new Complex(real, imag);
            list.add(number);
        }
        System.out.println("\nall elements:  ");
        for (int k = 0; k < list.size() ; k++) {
            System.out.println(list.get(k).toString());
        }
        System.out.print("\nposition you want to get: ");
        int v = sc.nextInt();
        System.out.print("\ncomplex " + v + "th: ");
        int v0 = v -1;
        System.out.println(list.get(v0).toString());
        System.out.println("\nCalculate sum of " + n + " complex number: ");
        float reals = 0;
        float images = 0;
        for (int j = 0; j < list.size() ; j++) {
            reals +=  list.get(j).realpart();
            images +=  list.get(j).imagepart();
        }
        Complex number1 = new Complex(reals, images);
        System.out.println(number1);
        System.out.println("\nCalculate product of " + n + " numbers");
        System.out.println(new Complex().mulTimes(list));
    }
}
