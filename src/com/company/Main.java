package com.company;

public class Main {

    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("Вероника");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Имя: " + encap.getName() + ", возраст: " + encap.getAge());
    }
}
