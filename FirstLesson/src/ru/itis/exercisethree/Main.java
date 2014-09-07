package ru.itis.exercisethree;


public class Main {
    static int recursion(int money) {
        if(money - 25 >= 0) {
            System.out.println("25");
            return recursion(money - 25);
        }

        if(money - 10 >= 0) {
            System.out.println("10");
            return recursion(money - 10);
        }

        if(money - 5 >= 0) {
            System.out.println("5");
            return recursion(money - 5);
        }

        if(money - 1 >= 0) {
            System.out.println("1");
            return recursion(money - 1);
        }
        return 0;
    }
    public static void main(String[] args) {
        recursion(245);
    }
}
