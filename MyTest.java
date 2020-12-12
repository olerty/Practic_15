package com.company;

import java.util.Scanner;

public class MyTest {
    int n;
    MyArrayList<Circle> circles = new MyArrayList<>();
    Scanner scan = new Scanner(System.in);

    public MyTest(int n) {
        this.n = n;
    }
    void adding() {
        System.out.println("Введите свойства объектов:");
        for (int i = 0; i < n; i++) {
            circles.add(new Circle(scan.nextInt(), scan.next(), scan.nextBoolean()));
        }
    }
    void out() {
        System.out.println("Ваша коллекция:");
        for (int i = 0; i < circles.size(); i++) {
            System.out.println(circles.get(i).toString());
        }
    }

    void outSize() {
        System.out.println("Размер коллекции: " + circles.size());
    }

    void addElement() {
            circles.add(new Circle(scan.nextInt(), scan.next(), scan.nextBoolean()));
    }

    void removeElement(int n) {
        try {
            circles.remove(n);
        }
        catch (Exception e) {
            System.out.println("Нельзя удалить этот элемент");
        }
    }
}
