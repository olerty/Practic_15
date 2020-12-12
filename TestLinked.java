package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class TestLinked {
    LinkedList<String> msg = new LinkedList<>();
    Scanner scan = new Scanner(System.in);
    int n;

    public TestLinked(int n) {
        this.n = n;
    }

    void additing() {
        System.out.println("Введите сообщения LinkedList");
        for (int i = 0; i < n; i++) {
            msg.add(scan.nextLine());
        }
    }

    void addElement(int i) {
        if (i < msg.size()) {
            msg.add(i, scan.nextLine());
        }
        else {
            System.out.println("Некорректный номер");
        }
    }

    void firstLast() {
        System.out.println("Введите первый добавляемый элемент:");
        msg.addFirst(scan.nextLine());
        System.out.println("Введите последний добавляемый элемент:");
        msg.addLast(scan.nextLine());
        System.out.println("Первый и последний элементы LinkedList:");
        System.out.println(msg.peekFirst());
        System.out.println(msg.peekLast());

    }

    void outDelFL() {
        System.out.println("Выводим и удаляем первый и последний элементы:");
        System.out.println(msg.pollFirst());
        System.out.println(msg.pollLast());
    }

    void out() {
        System.out.println("LinkedList:");
        System.out.println(msg);
    }
}
