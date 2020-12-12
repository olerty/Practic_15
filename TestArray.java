package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestArray {
    int n;
    ArrayList<Circle> circles = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public TestArray(int n) {
        this.n = n;
        circles.ensureCapacity(n); //емкость
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    void adding() {
        System.out.println("Введите свойства объектов:");
        for (int i = 0; i < n; i++) {
            circles.add(new Circle(scan.nextInt(), scan.next(), scan.nextBoolean()));
        }
    }

    void out() {
        Circle[] circlesArray = circles.toArray(new Circle[circles.size()]);
        System.out.println(Arrays.toString(circlesArray));
    }

    void outSize() {
        System.out.println("Размер ArrayList: " + circles.size());
    }

    void arrayRemove(int n) {
        try {
            circles.remove(n);
        }
        catch (Exception e) {
            System.out.println("Нельзя удалить этот элемент");
        }
    }
    void arrayClear() {
        circles.clear();
    }
}
